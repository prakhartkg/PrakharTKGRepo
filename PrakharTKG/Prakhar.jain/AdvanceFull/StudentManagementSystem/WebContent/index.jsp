<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>

</head>
<body bgcolor="Gray">
	<center>
		<form action="LoginAction">
			<table>
				<tr>
					<th align="left">User Name:</th>
					<td><input type="text" name="userId"></td>
				</tr>
				<tr>
					<th align="left">Password:</th>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td><input type="button"
						onclick="location.href='Regestration.jsp' " value="Regester"></td>
					<td><input type="submit" value="Login"></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>