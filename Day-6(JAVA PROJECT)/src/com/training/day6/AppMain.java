package com.training.day6;

import java.util.Scanner;

public class AppMain {
	Scanner sc;
	private double balance=10000;
	private double withdraw;
	private String username = "imageinfo";
	private String password="Image@07";
	public AppMain() {
		sc= new Scanner(System.in);
	}
	public void check() throws InvalidAmountException{
		System.out.println("Enter the Amount u want to withdraw");
		withdraw=sc.nextDouble();
		if(withdraw>balance) {
			throw new InvalidAmountException(); 
		}
		else {
			System.out.println("Your Amount is debited");
		}
	}
	public void check1() throws InvalidUserException{
		System.out.println("Enter the Username ");
		String username1=sc.next();
		System.out.println("Enter the Password ");
		String password1=sc.next();
		if((username.equals(username1))&& (password.equals(password1))) {
			System.out.println("you logged in successfully");
		}
		else {
			throw new InvalidUserException();

		}
		
	}public static void main(String[] args) {
		AppMain app = new AppMain();
		try {
			app.check();
			app.check1();
		}
		catch(InvalidAmountException e) {
			System.out.println(e.getMessage1());
		}
		catch(InvalidUserException e) {
			System.out.println(e.getMessage2());
		}
	}
}
