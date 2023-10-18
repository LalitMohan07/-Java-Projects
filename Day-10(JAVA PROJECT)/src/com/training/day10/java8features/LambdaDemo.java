package com.training.day10.java8features;

public class LambdaDemo {
	public void show() {
		
		Calculator c1=()->{
			System.out.println("THis is the first implementation");
		};
		c1.calculate();
		Calculator c2=()->{
			System.out.println("THis is the second implementation");
		};
		c2.calculate();
	}public static void main(String[] args) {
		LambdaDemo ld= new LambdaDemo();
		ld.show();
	}
}
