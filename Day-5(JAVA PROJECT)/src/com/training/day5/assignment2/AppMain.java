package com.training.day5.assignment2;

import java.util.Scanner;

public class AppMain {
	public static void main(String[] args) {
		Bank p1;
		Scanner sc= new Scanner(System.in);
		System.out.println("1. Bank1");
		System.out.println("2. Bank2");
		System.out.println("3. Bank3");

		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			p1= new Bank1();
			System.out.println("The Balance is "+p1.getBalance());
			break;
		case 2:
			p1= new Bank2();
			System.out.println("The Balance is "+p1.getBalance());
			break;
		case 3:
			p1= new Bank3();
			System.out.println("The Balance is "+p1.getBalance());
			break;
		
		}
}
}
