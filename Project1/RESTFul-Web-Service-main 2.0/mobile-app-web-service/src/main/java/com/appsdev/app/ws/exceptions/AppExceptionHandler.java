package com.appsdev.app.ws.exceptions;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.appsdev.app.ws.ui.model.response.ErrorMessage;
import com.appsdev.app.ws.exceptions.UserServiceException; 

@ControllerAdvice
public class AppExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = {Exception.class})
	public ResponseEntity<Object> handleAnyException(Exception e, WebRequest req) {
		
		String errorMessageDesc = e.getLocalizedMessage();
		
		if(errorMessageDesc == null) errorMessageDesc = e.toString();
		
		ErrorMessage errorMessage = new ErrorMessage(new Date(), errorMessageDesc);
		
		return new ResponseEntity<>(e, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value = { NullPointerException.class, UserServiceException.class })
    public ResponseEntity<Object> handleSpecificExceptions(Exception e, WebRequest req) {
        
    	String errorMessageDesc = e.getLocalizedMessage();
    	
    	if(errorMessageDesc == null) errorMessageDesc = e.toString();
    	
    	ErrorMessage errorMessage = new ErrorMessage(new Date(), errorMessageDesc);
    	
    	return new ResponseEntity<>(
    			errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    	
    }
}
