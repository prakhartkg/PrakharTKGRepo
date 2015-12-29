<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="employeeServlet">
		<table>
			<tr>
				<td>Search By Id</td>
				<td><input type="text" name="employee_id"></td>
			</tr>
			<tr>
				<td><Input type="submit" value="Search" name="btn"></td>
				<td><a href="AddEmployee.jsp" name="save">Add Employees</a></td>
			</tr>
				
		</table>
	</form>
	<hr>
	<div>
		<table border="1">
		  <tr>
		  <td>Employee Id</td>
		  <td>Employee Name</td>
		  <td>Employee City</td>
		  <td>Employee Salary</td>
		  <td>Action</td>
		  
		  </tr>
		  <c:forEach items="${employees}" var="employee">
		  	<tr>
		  		<td><c:out value="${employee.employee_id}"/></td>
		  		<td><c:out value="${employee.name}"/></td>
		  		<td><c:out value="${employee.city}"/></td>
		  		<td><c:out value="${employee.salary}"/></td>
		  		<td>
		  			<a href="employeeServlet?btn=update&employee_id=${employee.employee_id}">Edit</a>
		  			/
		  			<a href="employeeServlet?btn=delete&employee_id=${employee.employee_id}">Delete</a>
		  		</td>
		  	</tr>
		  </c:forEach>
		</table>
		
	</div>
</body>
</html>