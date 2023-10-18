package com.training.day6;

public class InvalidAgeException extends Exception {
	@Override
	public String getMessage() {
		return "Trying to enter invalid age";
	}
}
