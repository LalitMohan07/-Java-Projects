package com.training.day4;

public class Demo {
	private static Demo d1;
	private Demo() {
		System.out.println("Demo constructor called");
	}
	public static Demo getObj() {
		d1= new Demo();
		return d1;
	}
	public void display() {
		System.out.println("Welcome to singleton class");
	}
	
}
