package com.revature.exceptions;

public class CurrentUserIsNullException extends RuntimeException {

	public CurrentUserIsNullException() {
		super();
	}

	public CurrentUserIsNullException(String message) {
		super(message);
	}
	
}
