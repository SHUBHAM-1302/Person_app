package com.ty.Person.Person_app.exception;

public class MissFormatException extends RuntimeException {

	String message = " given format missmatch , plese try agian" ;
	public MissFormatException() {}
	public MissFormatException(String message) {
		this.message = message ;
	}
	
	public String getMessage() {
		return message ;
	}
	
}
