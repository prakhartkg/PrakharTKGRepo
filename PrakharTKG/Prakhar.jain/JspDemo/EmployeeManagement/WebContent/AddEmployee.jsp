<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
	<form action="employeeServlet">
		<table>
			<tr>
				<th>Enter Name</th>
				<td><input type="text" name="employeeName" ></td>
			</tr>
			<tr>
				<th>Enter City</th>
				<td><input type="text" name="employeeCity"></td>
			</tr>
			<tr>
				<th>Enter Salary</th>
				<td><input type="text" name="employeeSalary"></td>
			</tr>
			<tr>
			<td colspan="2"><input type="submit" value="save" name="btn"></td>
			</tr>
		</table>
	</form>
</body>
</html>