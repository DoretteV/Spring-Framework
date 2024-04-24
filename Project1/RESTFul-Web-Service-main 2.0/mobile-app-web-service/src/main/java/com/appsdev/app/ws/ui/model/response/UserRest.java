package com.appsdev.app.ws.ui.model.response;

public class UserRest {

	private String firstName;
	private String lastName;
	private String email;
	private String userId;
	
	//FIRSTNAME
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	//LASTNAME
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	//EMAIL
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//USERID
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
}
