<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update</title>
</head>
<body>
	<form action="registerUpdate" method="post">
		<table>
			<tr>
				<td>Enter Id where to update</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>Enter Name to Update</td>
				<td><input type="text" name="name" /></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value="Update" /></td>
			</tr>
		</table>
	</form>

</body>
</html>