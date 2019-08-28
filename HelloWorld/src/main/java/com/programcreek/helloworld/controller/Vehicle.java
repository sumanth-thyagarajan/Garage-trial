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
		Firstname="Sumanth";
		Lastname="thyagarajan";
		Gender="male";
		Vehcat="truck";
		Regno="TN88z8888";
		Address="A1, City park, Trichy, Tamil Nadu, India";
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
		if(gender==null||gender.equals("")) {Gender="Not specified";}
		else Gender = gender;
	}
	public String getVehcat() {
		return Vehcat;
	}
	public void setVehcat(String vehcat) {
		if(vehcat==null||vehcat.contentEquals("")) {Vehcat="Not specified";}
		else Vehcat = vehcat;
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
	public void setAddress(String doorno, String area, String district, String state, String country) {
		if(doorno==null||doorno.equals(""))doorno="XX";
		if(area==null||area.equals(""))area="XX";
		if(district==null||district.equals(""))district="XX";
		if(state==null||state.equals(""))state="XX";
		if(country==null||country.equals(""))country="India";
		Address = doorno+", "+area+", "+district+", "+state+", "+country;
	}
	
	String getMessage() {
		return "<br><strong>Vehicle condition :</strong> Good and it is verified by the Experts";
		
	}
	public String toString() {
		return "<strong>First Name 		 	: </strong>" +Firstname+"<br>\n"+ 
				"<strong>Last Name  		 	: </strong>" +Lastname+"<br>\n"+
				"<strong>Gender			 	: </strong>" + Gender+"<br>\n"+ 
				"<strong>Vehicle category 	: </strong>" + Vehcat +"<br>\n" +
				"<strong>Registration Number	: </strong>" + Regno+"<br>\n"+ 
				"<strong>Address				: </strong>" + Address+"<br>\n";
	}
	
}
