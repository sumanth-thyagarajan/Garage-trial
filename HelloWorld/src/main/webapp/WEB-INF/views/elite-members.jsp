<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body bgcolor="#F5F5F5">
	<form action="view-elite" method="get" >
	<h3><strong>Login</strong></h3>
		<hr>
		<smaller><font color="red">${message}</font></smaller><br><br>
		Username(Regno) : <br><br> <input type="text" name="Regno" required><br><br>
		Password  :<br><br><input type="password" name="Password" required><br><br>
		<input type="submit" name="Login" value="Login"><br><br>
	</form>

</body>
</html>