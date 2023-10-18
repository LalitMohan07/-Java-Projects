package com.training.Day1;

import java.util.Scanner;
class condition{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the age");
	int age=sc.nextInt();
	if(age>=16){
		System.out.println("Eligible to ride scooty");
	}
	else{
		System.out.println(" Not Eligible to ride scooty");
	}
}
}