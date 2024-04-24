package com.appsdev.app.ws.ui.model.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

public class UserDetailsRequestModel {

	@NotNull(message="first name is required")
	@Size(min=2, message="first name must be no less than 2 characters")
	private String firstName;
	
	@NotNull(message="last name is required")
	@Size(min=2, message="last name must be no less than 2 characters")
	private String lastName;
	
	@NotNull(message="email address is required")
	@Email
	private String email;
	
	@NotNull(message="password is required")
	@Size(min=8, max=16, message="password must be no less than 8 characters and can't exceed 16 characters")
	private String password;
	
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
	
	//PASSWORD
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
