package com.paramazon.exceptions;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ResponseExceptionHandler extends ResponseEntityExceptionHandler{
	
	 @ExceptionHandler(value = { Exception.class, IllegalStateException.class })
	protected ResponseEntity<Object> notFound(Exception ex, WebRequest request) {
		
		String errorDescription = ex.getLocalizedMessage();
		
		if(errorDescription == null) {
			errorDescription = ex.toString();
		}
		
		ErrorDetails erro = new ErrorDetails();
		erro.setError(errorDescription);
		erro.setCode(HttpStatus.NOT_FOUND.toString());
		erro.setCurrentDate(new Date());
	    return new ResponseEntity<>(erro, new HttpHeaders(), HttpStatus.NOT_FOUND);
	}
}
