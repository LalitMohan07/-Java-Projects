package com.training.Day2;
import java.util.Scanner;
class calculator{
	private int number1;
	private int number2;
	public calculator(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1 :");
		number1=sc.nextInt();
		System.out.println("Enter number 2 :");
		number2=sc.nextInt();
	}
	public void add(){
		
   		System.out.println("Sum is"+" "+(number1+number2));
	}
	public void subtract(){
		
  		System.out.println("Substraction is"+" "+(number1-number2));
	}
	public void multiply(){
		
		System.out.println("Multiplication is"+" "+(number1*number2));
	}
	public void divide(){
		
		System.out.println("Division is"+" "+(number1/number2));
	}
	
		


	
	public static void main(String args[]){

		calculator cal= new calculator();
		cal.add();
		cal.subtract();
		cal.multiply();
		cal.divide();
        	
	}
}


