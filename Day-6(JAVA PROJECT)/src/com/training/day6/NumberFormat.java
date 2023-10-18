package com.training.day6;

import java.util.Scanner;

public class NumberFormat {
  Scanner sc;
  String s;
  public void display() {
	  sc= new Scanner(System.in);

	  try {
		  System.out.println("Enter a string u want to convert to int ");
		  sc.next();
		  Integer.parseInt(s);
	  }
	  catch(NumberFormatException e) {
		  System.out.println("Trying to convert int to string");
	  }
  }
  public static void main(String[] args) {
	NumberFormat nm= new NumberFormat();
	nm.display();
	
}
}
