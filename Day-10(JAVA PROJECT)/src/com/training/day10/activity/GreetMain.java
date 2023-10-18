package com.training.day10.activity;

public class GreetMain {
	public void show() {
		Greeting g1 =()->{
			System.out.println("Good Morning");
		};
		g1.greet();
		Greeting g2 =()->{
			System.out.println("Wish u a Happy Birthday");
		};
		g2.greet();
		Greeting g3 =()->{
			System.out.println("Good Evening");
		};
		g3.greet();
	}
	public static void main(String[] args) {
		GreetMain greetm= new GreetMain();
		greetm.show();
	}
}
