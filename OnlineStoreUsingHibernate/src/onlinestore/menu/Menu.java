package onlinestore.menu;

import java.sql.SQLException;
import java.util.Scanner;

import onlinestore.service.Service;


public class Menu {
	Scanner sc;
	Service userservice;
	public Menu() {
		userservice = new Service();
	}
	public void displayMenu()  {
		sc= new Scanner(System.in);
		String choice="y";
		int ch=0;
		while(choice.equals("y")) {
			System.out.println("Enter your choice ");
			System.out.println("1.Admin login ");
			System.out.println("2.User log in ");
			System.out.println("3.Register user ");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				userservice.adminvalidation();
				
				break;
			case 2:
				userservice.uservalidation();
				break;
			case 3:
				userservice.userregister();
				break;
			
			
			}
				
			System.out.println("Do you want to continue(Y/N");
			choice=sc.next();

		}

	}
}

