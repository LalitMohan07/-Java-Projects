package com.training.day5.assignment3;

import java.util.Scanner;

public abstract class Marks {
	protected double subject1;
	protected double subject2;
	protected double subject3;
	protected Scanner sc;
	public abstract double getPercentage();
	public Marks() {
		 sc = new Scanner(System.in);
		
	}
	public void accept() {
		System.out.println("Enter the Marks for Subject 1");
		subject1= sc.nextDouble();
		System.out.println("Enter the Marks for Subject 2");
		subject2= sc.nextDouble();
		System.out.println("Enter the Marks for Subject 3");
		subject3= sc.nextDouble();
	}
}
