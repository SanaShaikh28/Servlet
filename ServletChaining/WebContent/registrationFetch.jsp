<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Fetch Details</title>
</head>
<body>
	<%
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
	%>
	<h4 align="center">
		<font><strong>Fetch data from database</strong></font>
	</h4>
	<table align="center" cellpadding="5" cellspacing="5" border="1">
		<tr>

		</tr>
		<tr bgcolor="blue">
			<td><b>Id</b></td>
			<td><b>Name</b></td>
			<td><b>Password</b></td>

		</tr>
		<%
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bidgelabz_db", "root", "root");
				out.println("Connection Established");
				preparedStatement = connection.prepareStatement("SELECT * from registration");
				resultSet = preparedStatement.executeQuery();
				//out.print(resultSet);

				while (resultSet.next()) {
		%>
		<tr>
			<td><%=resultSet.getString("id")%></td>
			<td><%=resultSet.getString("name")%></td>
			<td><%=resultSet.getString("password")%></td>
		</tr>

		<%
			}
			} catch (Exception e) {
				out.print(e);
			}
		%>
	</table>
</body>
</html>