package com.training.day6.activity;

public class CountryNotValidException extends Exception{
	public String getMessage() {
		return"The employee should be an Indian citizen";
	}

}
