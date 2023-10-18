package com.training.Day1;
import java.util.Scanner;
class product{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the 1st number");
	int number1=sc.nextInt();
	System.out.println("Enter the 2nd number");
	int number2= sc.nextInt();
	int prod=number1*number2;
	System.out.println("The product is"+" "+prod);
}
}
