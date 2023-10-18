package com.training.day5.assignment1;

import java.util.Scanner;

public class AppMain {
	public static void main(String[] args) {
		Parent p1;
		Scanner sc= new Scanner(System.in);
		System.out.println("1. SubClass1");
		System.out.println("2. SubClass2");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			p1= new SubClass1();
			p1.message();
			break;
		case 2:
			p1= new SubClass2();
			p1.message();
			
		}

	}
}
