package com.training.menu;

import java.sql.SQLException;
import java.util.Scanner;

import com.training.service.AdminLibrarianValidation;

public class Menu {
	Scanner sc;
	AdminLibrarianValidation libservice;
	public Menu() {
		sc= new Scanner(System.in);
		libservice= new AdminLibrarianValidation();
	}
	public void displayMenu() throws SQLException {
		sc= new Scanner(System.in);
		String choice="y";
		int ch=0;
		while(choice.equals("y")) {
			System.out.println("Enter your choice ");
			System.out.println("1.Admin login ");
			System.out.println("2.Librarian log in ");
			System.out.println("3.Register user ");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				libservice.adminValidation();
				
				break;
			case 2:
				libservice.librarianValidation();
				break;
			case 3:
				libservice.register();
				break;
			
			
			}
				
			System.out.println("Do you want to continue(Y/N");
			choice=sc.next();

		}
	}
}
