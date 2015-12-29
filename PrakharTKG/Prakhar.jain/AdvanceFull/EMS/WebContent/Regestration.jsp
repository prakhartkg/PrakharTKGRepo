<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<form action="RegestrationActionServlet">
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
					<th align="left">Select Type:</th>
					<td><select name=type>
							<option value=1>user</option>
							<option value=2>Admin</option>
					</select></td>
				</tr>
				<tr>
					<th align="left">User Name:</th>
					<td><input type="text" name="userName"></td>
				</tr>
				<tr>
					<th align="left">Password:</th>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Register"></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>