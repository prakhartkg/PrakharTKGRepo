<%@page import="java.util.List"%>
<%@page import="com.yash.ems.Domain.Enquiry"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UserLogin</title>
<script type="text/javascript">
	function enable() {
		if (document.getElementById("checkbox").checked == true)
			document.getElementById("sub").disabled = false;
		else
			document.getElementById("sub").disabled = true;
	}
</script>
<style type="text/css">
#containerHeader {
	height: 30%;
	color: red;
	background-color: pink;
}
</style>
</head>
<body bgcolor="Gray">
	<%@ include file="Header.html"%>
	<input type="button" onclick="location.href='LogOutServlet'"
		value="LogOut">
	<div align="center">
		<h3>Welcome User:${currentUser.name}</h3>
		<br>

		<form action="AddServlet">
			<table>
				<tr>
					<th colspan="7">***********************All Entries*********************</th>
				</tr>
				<tr>
				<tr>
					<th>select</th>
					<th>Id</th>
					<th>Name</th>
					<th>Email</th>
					<th>Contact</th>
					<th>Course</th>
					<th>Operations</th>
				</tr>
				<c:forEach var="user" items="${Entries}">
					<tr>
						<td align="center"><input type="checkbox" id="checkbox"
							onclick="enable()" name="delete" value="${user.enquireId}"></td>
						<td align="center">${user.enquireId}</td>
						<td align="center">${user.name}</td>
						<td align="center">${user.email}</td>
						<td align="center">${user.contact}</td>
						<td align="center">${user.course}</td>
						<td align="center"><input type="button" id="sub"
							onclick="location.href='DeleteServlet?enquireId=${user.enquireId}'"
							value="Delete"></td>

					</tr>
				</c:forEach>
				<tr>
					<th colspan="7"><br></th>
				</tr>
				<tr>
				<tr>
					<th colspan="7">***********************Add
						Enquary*********************</th>
				</tr>
				<tr>
					<td colspan="2" align="center">Add Enquiries</td>
					<td align="center"><input class="h" type="text" name="name">
					<td align="center"><input type="text" name="email">
					<td align="center"><input class="h" type="text" name="contact">
					<td><input type="checkbox" name="course" value="core"
						align="left"> CORE JAVA<br> <input type="checkbox"
						name="course" value="advance" align="left"> ADVANCE<br>
						<input type="checkbox" name="course" value="spring" align="left">
						SPRING <br> <input type="checkbox" name="course" value="html"
						align="left">HTML <br> <input type="checkbox"
						name="course" value="css" align="left"> CSS</td>
					<td><input type="submit" value="Add"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>