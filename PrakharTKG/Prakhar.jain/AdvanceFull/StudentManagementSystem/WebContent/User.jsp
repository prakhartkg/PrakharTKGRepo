<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="jquery.js"></script>
<script type="text/javascript" src="jquery-ui.js"></script>
<script type="text/javascript" src="DynamicScript.js"></script>
<script type="text/javascript">
</script>
<link rel="stylesheet" href="jquery-ui.css">
<link rel="stylesheet" type="text/css" href="DynamicCSS.css">
</head>
<body>
	<h1>Welcome:${Person.name}</h1>
	<hr>
	<input type="button" id="add" value="ADD STUDENT">
	<input type="button" id="delete" value="Delete Student" onclick="deletefun()">
	<input type="button" id="update" value="update student">
	<br>
	<br>
	<div id="ShowStudents">
	<table align="center">
	<tr>
	<th>Select</th>
	<th>RollNo</th>
	<th>Name</th>
	<th>Address</th>
	<th>Contact</th>
	<th>Course</th>
	
	</tr>
		<c:forEach var="student" items="${students}">
			<tr>
				<td><input type="radio" name="radio" value="${student.rollNo}" id='${student.rollNo}'></td>
				<td align="center">${student.rollNo}</td>
				<td align="center">${student.name}</td>
				<td align="center">${student.address}</td>
				<td align="center">${student.contact}</td>
				<td align="center">${student.course}</td>
				
			</tr>
		</c:forEach>
	</table>
	</div>
	<div id="dialog">
		<form action="AddStudentServlet" id="fid">
			<table align="center">

				<tr>
					<td><strong>Enter Name:</strong></td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td><strong>Enter RollNo:</strong></td>
					<td><input type="text" name="rollNo"></td>
				</tr>
				<tr>
					<td><strong>Contact:</strong></td>
					<td><input type="text" name="contact"></td>
				</tr>
				<tr>
					<td><strong>Address:</strong></td>
					<td><input type="text" name="address"></td>
				</tr>
				<tr>
					<td><strong>Course:</strong></td>
					<td><input type="text" name="course"></td>
				</tr>

				<tr>

					<td colspan="2" align="center"><input type="reset"
						value="reset" class="ui-button"> <input type="submit"
						class="ui-button" value="Add" id="submit"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>