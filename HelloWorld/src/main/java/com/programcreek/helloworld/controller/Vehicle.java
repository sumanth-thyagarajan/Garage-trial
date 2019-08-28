package com.programcreek.helloworld.controller;

public class Vehicle {
	//asdsddasd
	
	private String Firstname;
	private String Lastname;
	private String Gender;
	private String Vehcat;
	private String Regno;
	private String Address;
	
	public Vehicle() {
		
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getVehcat() {
		return Vehcat;
	}
	public void setVehcat(String vehcat) {
		Vehcat = vehcat;
	}
	public String getRegno() {
		return Regno;
	}
	public void setRegno(String regno) {
		Regno = regno;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	String getMessage() {
		return "<br>\nVehicle condition : Good and it is verified by the Experts";
		
	}
	public String toString() {
		return "First Name 		 	: " +Firstname+"<br>\n"+ 
				"Last Name  		 	: " +Lastname+"<br>\n"+
				"Gender			 	: " + Gender+"<br>\n"+ 
				"Vehicle category 	: " + Vehcat +"<br>\n" +
				"Registration Number	: " + Regno+"<br>\n"+ 
				"Address				: " + Address+"<br>\n";
	}
	
}
