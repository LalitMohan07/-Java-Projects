package com.training.day6;

import java.util.Scanner;

public class AgeDemo {
	Scanner sc;
	private int age;
	public AgeDemo() {
		sc= new Scanner(System.in);
		
	}
	public void checkAge() throws InvalidAgeException {
		System.out.println("Enter the age ");
		age=sc.nextInt();
		/*try {
			if(age<18) {*/
				throw new InvalidAgeException();
				/*
				 * } } catch(InvalidAgeException e) { System.out.println(e.getMessage()); }
				 */
	}
	public static void main(String[] args) {
		AgeDemo a = new AgeDemo();
		try {
			
			a.checkAge();
		}
		catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
