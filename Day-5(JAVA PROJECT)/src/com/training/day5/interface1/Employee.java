package com.training.day5.interface1;

public class Employee implements PersonalDetails{

	@Override
	public void acceptName() {
		System.out.println("Accept the Name of Employee");
	}

	@Override
	public void acceptAddress() {
		System.out.println("Accept the Address of Employee");
		
	}
	
}
