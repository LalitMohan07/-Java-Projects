package com.training.day10.java8features;

public class Calculate1Main {
	public void display() {
		Calculator1 add=(num1,num2)->{
			return num1+num2;
		};
		int total=add.calculate(45, 78);
		System.out.println("THe total value is "+total);
		Calculator1 difference=(x,y)->{
			return x-y;
		};
		int sub=difference.calculate(105, 78);
		System.out.println("THe Differnece  is "+sub);
		
	}
	public static void main(String[] args) {
		Calculate1Main cmain = new Calculate1Main();
		cmain.display();
	}
}
