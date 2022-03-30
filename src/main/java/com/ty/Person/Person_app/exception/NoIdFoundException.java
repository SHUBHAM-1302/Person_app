package com.ty.Person.Person_app.exception;

public class NoIdFoundException extends RuntimeException{
	
	String message = "given id not found" ;
			
			public NoIdFoundException() {}
			
	        public NoIdFoundException(String message) {
	        	this.message =message ;
	        }

	        @Override
	        public String getMessage() {
	        	return message ;
	        }
	        
	        
}
