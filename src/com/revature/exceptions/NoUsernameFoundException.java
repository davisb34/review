package com.revature.exceptions;

public class NoUsernameFoundException extends RuntimeException {

	public NoUsernameFoundException() {
		super();
	}

	public NoUsernameFoundException(String message) {
		super(message);
	}

}
