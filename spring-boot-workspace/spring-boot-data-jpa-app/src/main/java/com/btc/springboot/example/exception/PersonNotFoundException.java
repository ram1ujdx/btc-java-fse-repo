package com.btc.springboot.example.exception;

public class PersonNotFoundException extends RuntimeException {

	public PersonNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public PersonNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public PersonNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public PersonNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
	
}
