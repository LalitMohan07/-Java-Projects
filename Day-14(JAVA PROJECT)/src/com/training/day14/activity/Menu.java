package com.training.day14.activity;

import java.util.Scanner;

public class Menu {
	Scanner sc;
	Data dobj;
	public Menu() {
		sc= new Scanner(System.in);
		dobj= new Data();
	}
	public void displayMenu() {
		sc= new Scanner(System.in);
		String choice="y";
		int ch=0;
		while(choice.equals("y")) {
			System.out.println("Enter your choice ");
			System.out.println("1.Read file");
			System.out.println("2.Write in file ");
			ch= sc.nextInt();
			switch(ch) {
			case 1:
				dobj.readdata();
				break;
			case 2:
				dobj.writedata();
				break;
			}
			System.out.println("Do you want to continue(Y/N");
			choice=sc.next();

		}
	}
}
