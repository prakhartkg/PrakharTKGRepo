<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String id = request.getParameter("enquireId");
		request.getSession().setAttribute("id", Integer.parseInt(id));
	%>
	<center>
		<form action="EditServlet">
			<table>
				<tr>
					<th align="left">Enter Name:</th>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<th align="left">Enter email Id:</th>
					<td><input type="text" name="email"></td>
				</tr>
				<tr>
					<th align="left">Enter Contact No:</th>
					<td><input type="text" name="contact"></td>
				</tr>

				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Edit"></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>