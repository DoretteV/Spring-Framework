package com.appsdev.app.ws.ui.model.request;

import jakarta.validation.constraints.Email;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UpdateUserDetailsRequestModel {

	@NotNull(message="first name is required")
	@Size(min=2, message="first name must be no less than 2 characters")
	private String firstName;
	
	@NotNull(message="last name is required")
	@Size(min=2, message="last name must be no less than 2 characters")
	private String lastName;
	
	@NotNull(message="Email cannot be null")
	@Email
	private String email;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
