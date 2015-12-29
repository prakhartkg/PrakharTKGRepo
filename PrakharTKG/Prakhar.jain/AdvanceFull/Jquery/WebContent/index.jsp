<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dynamic Form</title>
<script type="text/javascript" src=""></script>
<link rel="stylesheet" type="text/css" href="DynamicCSS.css">
<script type="text/javascript" src="jquery.js"></script>
<script type="text/javascript" src="DynamicScript.js"></script>
</head>
<body>
	<header>
	<div id="header"><%@ include file="header.html"%></div>
	</header>
	<div id="maincontainer">
		<div id="textarea"></div>
		<div id="formarea">
			<br> &nbsp;&nbsp;<input type="button" value="AddField" id="add">

			<form action="ShowServlet">
				<table align="center" border=2>
				
						<tr>
						<td>Book Name :</td>
						<td><input type="text" name="txtbookname"></td>
						</tr>
				
					
					
					<tr id="addField">
					</tr>
					<tr>
						<td colspan=3><input type="submit" value="Submit"></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<footer>
	<div id="footer"><%@ include file="footer.html"%></div>
	</footer>
</body>
</html>