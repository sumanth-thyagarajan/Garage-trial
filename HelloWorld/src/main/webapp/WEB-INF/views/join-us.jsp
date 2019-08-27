<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Join-us</title>
</head>
<body bgcolor="#F5F5F5">
	<form action="process-Form" method="get" >
		<h3><strong>Sign-up  Form</strong></h3>
		<hr>
		<br>
		Firstname :  <input type="text" name="Firstname"><br><br>
		Lastname  :   <input type="text" name="Lastname"><br><br>
		Gender    :  
				<input type="radio" name="Gender" value="Male">Male  
				<input type="radio" name="Gender" value="Female">Female  
				<input type="radio" name="Gender" value="Other">Other  <br><br>
		Vehicle category : 
				<input type="radio" name="VehCat" value="Car">Car
				<input type="radio" name="VehCat" value="Truck">Truck <br><br>
		Vehicle Registration no : 
				<input type="text" name ="RegNo"><br><br> 
		Address : <br><br>
		<textarea rows="4" cols="50" name="Address"></textarea><br><br>
		<input type="submit" value="Submit">
	</form>
</body>
</html>