package com.training.day4;

public class child extends base {
	public child() {
		super(30);
		System.out.println("This is a child class constructor");
	}
	public void display() {
		System.out.println("This is a child class method");

	}
	public static void main(String args[]) {
		base b= new base();
		b.display1();
		child c= new child();
		c.display();
		c.display1();
	}
}
