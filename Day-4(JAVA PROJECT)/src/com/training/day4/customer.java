package com.training.day4;

public class customer {
	private static int custId;
	private static String custName;
	static {
		System.out.println("IT will get executed before the main method");
	}
	public static void accept() {
		custId=101;
		custName="Mohit";
	}
	public void display() {
		System.out.println("The customer id is "+custId);
		System.out.println("The customer Name is "+custName);

	}
	public static void main(String args[]) {
		customer cs= new customer();
		cs.display();
		accept();
		cs.display();

	}
} 
