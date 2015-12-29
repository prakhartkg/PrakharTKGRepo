<%@page import="java.util.List"%>
<%@page import="com.yash.jsp.bean.Employee"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
		<h1>Employee Details</h1>
		<table>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>City</th>
				<th>Position</th>
				<th>Salary</th>
			</tr>
			<c:forEach var="customer" items="${ employeeList}">
			<tr>
				<td>${customer.id}</td>
				<td>${customer.name}</td>
				<td>${customer.city}</td>
				<td>${customer.position}</td>
				<td>${customer.salary}</td>
			</tr>
		</c:forEach>
		</table>
		Insert More<a href="insert.jsp">Click Here</a>
	</center>

</body>
</html>