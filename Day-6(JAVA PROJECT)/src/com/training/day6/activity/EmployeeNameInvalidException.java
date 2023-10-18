package com.training.day6.activity;

public class EmployeeNameInvalidException extends Exception{
	public String getMessage() {
		return"Employee name cannot be empty";
	}
}
