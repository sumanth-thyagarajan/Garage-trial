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
		Firstname :  <input type="text" name="Firstname" required><br><br>
		Lastname  :   <input type="text" name="Lastname" required><br><br>
		Gender    :  
				<input type="radio" name="Gender" value="Male">Male  
				<input type="radio" name="Gender" value="Female">Female  
				<input type="radio" name="Gender" value="Other">Other  <br><br>
		Vehicle category : 
				<input type="radio" name="VehCat" value="Car">Car
				<input type="radio" name="VehCat" value="Truck">Truck <br><br>
		Vehicle Registration no : 
				<input type="text" name ="RegNo" required><br><br> 
		Address : <br>
				<input text="text" name="Doorno" placeholder="Doorno"><br><br>
				<input text="text" name="Area" placeholder="Area"><br><br>
				<select name="Districts">
					<option value="" selected disabled hidden>Select a district from here</option>
				  	<option value="ariyalur">Ariyalur</option>
				  	<option value="chennai">Chennai</option>
				  	<option value="kancheepuram">Kancheepuram</option>
				  	<option value="trichy">Trichy</option>
				  	<option value="udumalaipet">Udumalaipet</option>
				</select>
				<br><br>
				<select name="State">
				  	<option value="tamil nadu" selected>Tamil Nadu</option>
				  	<option value="andra pradesh" disabled>Andra Pradesh</option>
				  	<option value="kerala" disabled>Kerala</option>
				  	<option value="punjab" disabled>Punjab</option>
				  	<option value="madhya pradesh" disabled>Madhya Pradesh</option>
				</select>
				<br><br>
				<select name="country" disabled>
				  	<option value="India" selected>India</option>
				  	<option value="USA">USA</option>
				  	<option value="China" >China</option>
				  	<option value="Pakistan" >Pakistan</option>
				  	<option value="Sri Lanka" >Sri Lanka</option>
				</select>
				<br><br>
		<!-- <textarea rows="4" cols="50" name="Address"></textarea><br><br> -->
		<input type="submit" value="Submit">
	</form>
</body>
</html>