package com.training.day6;

import java.util.Scanner;

public class ArithDemo {
	 private int number1,number2;
	 private Scanner sc;
	 public void accept() {
		 sc= new Scanner(System.in);
		 System.out.println("Enter the first number ");
		 number1= sc.nextInt();
		 System.out.println("Enter the second number ");
		 number2= sc.nextInt();
		 double result;
		 try{
			result=number1/number2;
			System.out.println("The Result is "+result);
		 }
		 catch(ArithmeticException e) {
			 System.out.println("Trying to divide with zero will give exception");
		 }
	
	 }
	 public static void main(String[] args) {
		ArithDemo ard = new ArithDemo();
		ard.accept();
	}

}
