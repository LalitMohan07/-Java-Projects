package com.training.day5.assignment3;

import java.util.Scanner;
public class AppMain {
	public static void main(String[] args) {
		Marks p1;
		Marks p2;
		Scanner sc= new Scanner(System.in);
		System.out.println("1. StudentA");
		System.out.println("2. StudentB");

		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			p1= new StudentA();
			p1.accept();
			System.out.println("The perecntage is "+p1.getPercentage());
			break;
		case 2:
			p2= new StudentB();
			p2.accept();

			System.out.println("The percentage is "+p2.getPercentage());
			break;
		
		}

}
}
