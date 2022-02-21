package com.revature.exceptions;

public class IncorrectPasswordException extends RuntimeException {

	public IncorrectPasswordException() {
		super();
	}

	public IncorrectPasswordException(String message) {
		super(message);
	}

}
