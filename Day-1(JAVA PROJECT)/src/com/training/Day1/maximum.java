package com.training.Day1;
import java.util.Scanner;
class maximum{
	public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the 1st number");
	int number1=sc.nextInt();
	System.out.println("Enter the 2nd number");
	int number2= sc.nextInt();
	System.out.println("Enter the 3rd number");
	int number3= sc.nextInt();
	if(number1>number2){
		if(number1>number3){
			System.out.println("Number1 is Greater");
			}
		else{
			System.out.println("Number3 is Greater");
			}
	}
	else if(number2>number3){
		System.out.println("Number2 is Greater");
	}
	else{
		System.out.println("Number3 is Greater");
	}
}
}
