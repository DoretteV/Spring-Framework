package com.appsdev.app.ws.userservice;

import com.appsdev.app.ws.ui.model.response.UserRest;

import java.util.List;

import com.appsdev.app.ws.ui.model.request.*;

public interface UserService {

	UserRest createUser(UserDetailsRequestModel userDetails);

	List<UserRest> getAllUsers();
	
	UserRest getUserById(String userId);
	 
	UserRest updateUser(String userId, UpdateUserDetailsRequestModel userDetails);
	    
	void deleteUser(String userId);
}
