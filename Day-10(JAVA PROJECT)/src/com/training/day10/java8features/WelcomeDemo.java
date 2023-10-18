package com.training.day10.java8features;

public class WelcomeDemo {
	public void display() {
		Calculator c1 = new Calculator() {
			public void calculate() {
				System.out.println("It is the first implementation");
			}
		};			c1.calculate();
		Calculator c2 = new Calculator() {
			public void calculate() {
				System.out.println("It is the second implementation");

			}
		};c2.calculate();
	}
	public static void main(String[] args) {
		
		WelcomeDemo wd = new WelcomeDemo();
		wd.display();
	}
}
