package com.btc.springboot.example.exception;

public class PersonAlreadyExistsException extends RuntimeException{

	public PersonAlreadyExistsException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonAlreadyExistsException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public PersonAlreadyExistsException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public PersonAlreadyExistsException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public PersonAlreadyExistsException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
	
}
