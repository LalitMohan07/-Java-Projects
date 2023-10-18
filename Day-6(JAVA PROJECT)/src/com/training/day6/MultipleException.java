package com.training.day6;

import java.util.Scanner;

public class MultipleException {
	Scanner sc;
	int arr[];
	String s;
	public MultipleException() {
		sc= new Scanner(System.in);
		arr= new int[5];
		
	}
	public void accept(){
		System.out.println("Enter a string value");
		s=sc.next();
		for(int x=0;x<arr.length;x++) {
			System.out.println("Enter the value ");
			arr[x]=sc.nextInt();
		}
	}
	public void divide() {
		try {
			
			System.out.println("Enter the 1st index number ");
			int index1=sc.nextInt();
			System.out.println("Enter the 2nd index number ");
			int index2=sc.nextInt();
			double result=arr[index1]/arr[index2];
			System.out.println("The result is "+ result);
			Integer.parseInt(s);
		}
		catch(ArithmeticException e) {
			System.out.println("Trying to divide with zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("TRying to access beyond limit");
		}
		catch(NumberFormatException e) {
			System.out.println("Trying to convert string value to integer" );
		}
		catch(Exception e) {
			System.out.println("THis is the catch block");
		}
		finally {
			System.out.println("This is the finally block");
		}

	}
	public static void main(String[] args) {
		MultipleException me = new MultipleException();
		me.accept();
		me.divide();
	}
	
}
