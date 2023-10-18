package com.training.assesment2;

import java.util.Scanner;

public class AdultUsers implements LibraryUser{
	protected  int age;
	protected  String bookType;
	protected Scanner sc;
	
	public AdultUsers() {
		sc= new Scanner(System.in);
		System.out.println("Enter your Age ");
		age= sc.nextInt();
		registerAccount();
		System.out.println("Enter the Booktype");
		bookType=sc.next();
		requestBook();
		
		
	}
	@Override
	public void registerAccount() {
		if(age>12) {
			System.out.println("You have successfully registered under a Adult account");
		}
		else {
			System.out.println("Sorry,age must be greater than 12 to register as an adult");
		}
	}

	@Override
	public void requestBook() {
		if(bookType.equals("fiction")) {
			System.out.println("Book issued Successfully, please return the book within 7 days");
		}
		else {
			System.out.println("Oops! you are allowed to take only fiction books");
		}
	}

}
