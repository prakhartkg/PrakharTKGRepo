<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AjaxDemo</title>
<script type="text/javascript">
/*  function call(){
var xhttp = new XMLHttpRequest();
xhttp.onreadystatechange = function() {
    if (xhttp.readyState == 4 && xhttp.status == 200) {
     document.getElementById("demo").innerHTML = xhttp.responseText;
    }
  }
xhttp.open("GET", "DemoServlet", true);
xhttp.send();
}  */
 function call(){
	var id=document.getElementById("eid");
	var eid=id.value.toString();
	 var xhttp = new XMLHttpRequest();
	 xhttp.onreadystatechange = function() {
	     if (xhttp.readyState == 4 && xhttp.status == 200) {
	      document.getElementById("demo").innerHTML = xhttp.responseText;
	     }
	   }
	 xhttp.open("GET", "GetDetailServlet?eid="+eid, true);
	 xhttp.send();
	 }
</script>
</head>
<body>
<%-- <%! static int i=0; %>
<% i++;%>
<%=i %> --%>
<form name="form">
<input type="text" id="eid">
<input type="button" value="Ok" onclick="call()">
</form>
<p id="demo"></p>
</body>
</html>