package com.demo.menu;

import java.util.Scanner;

import com.demo.service.employeeService;

public class menu {
	Scanner sc;
	employeeService empservice;
	public menu() {
		empservice = new employeeService();
	}
	public void displayMenu() {
		sc= new Scanner(System.in);
		String choice="y";
		int ch=0;
		while(choice.equals("y")) {
			System.out.println("Enter your choice ");
			System.out.println("1.Insert Employee ");
			System.out.println("2.Delete Employee ");
			System.out.println("3.Update Employee ");
			System.out.println("4.View Employee ");
			System.out.println("5.Exit ");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				empservice.insertDetails();
				break;
			case 2:
				empservice.deleteDetails();

				break;
			case 3:
				empservice.updateDetails();

				break;
			case 4:
				empservice.show();
				break;
			case 5:
				System.exit(0);
				break;
			
			}
				
			System.out.println("Do you want to continue(Y/N");
			choice=sc.next();

		}

	}
	
	
}
