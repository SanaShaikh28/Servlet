<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Delete Data</title>
</head>
<body>
	<form action="registrationDelete" method="post">
		<table>
			<tr>
				<td>Enter ID To Delete</td>
				<td><input type="text" name="id" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Delete" /></td>
			</tr>
		</table>
	</form>
<body>
</body>
</html>