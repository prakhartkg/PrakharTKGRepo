<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="jquery.js"></script>
<script type="text/javascript" src="jquery-ui.js"></script>
<script type="text/javascript" src="DynamicScript.js"></script>
<link rel="stylesheet" href="jquery-ui.css">
<link rel="stylesheet" type="text/css" href="DynamicCSS.css">
</head>
<body bgcolor="#3399FF">

	<div id="maincontainer">
		<div id="textarea">
			<div id="buttonContainer">
				<div id="upper">
					<br> &nbsp;&nbsp;<input type="button" value="Add "
						id="add">
				</div>
				<div id="details">
					<br>
				</div>
			</div>
			<div id="EmployeeContainer"></div>
		</div>
		<div id="formarea">
				<div id="show">
				
				</div>
		</div>
			<div id="dialog" title="Basic dialog">
				<form action="index.jsp" id="fid">
					<table align="center">
						<tr>
							<td></td>
							<td colspan="2" align="right"><img src="" height="100px"
								width="100px" id="image"></td>
						</tr>
						<tr>
							<td><strong>Enter Name:</strong></td>
							<td><input type="text" name="name"></td>
						</tr>
						<tr>
							<td><strong>Enter Email:</strong></td>
							<td><input type="text" name="email"></td>
						</tr>
						<tr>
							<td><strong>Enter Contact Details:</strong></td>
							<td><input type="text" name="contact"></td>
						</tr>
						<tr>
							<td><strong>Select Image:</strong></td>
							<td><input type="file" name="image" onchange="read(this)"></td>
						</tr>
						<tr>
							
							<td  colspan="2" align="center">
							<input type="reset" value="reset" class="ui-button">
							<input type="button" onclick="add(this)" class="ui-button" value="Add" id="submit">
							</td>
						</tr>
					</table>
				</form>
			</div>

		
	</div>

</body>
</html>