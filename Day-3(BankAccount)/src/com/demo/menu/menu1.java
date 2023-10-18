package com.demo.menu;

import java.util.Scanner;

import com.demo.service.accountService;

public class menu1 {
	Scanner sc;
	accountService accsr;
	public menu1() {
		accsr= new accountService();
	}
	public void displayMenu() {
		sc= new Scanner(System.in);
		String choice="y";
		int ch=0;
		while(choice.equals("y")) {
			System.out.println("Enter your choice ");
			System.out.println("1.Enter information and balance ");
			System.out.println("2.Display the Information ");
			System.out.println("3.Add balance and display total ");
			System.out.println("4.Remove balance and display total  ");
			System.out.println("5.Change the Address and display final information ");
			System.out.println("6.Total no of Transactions");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				accsr.unique();
				break;
			case 2:
				accsr.show();
				break;
			case 3:
				accsr.balanceAdd();
				break;
			case 4:
				accsr.balanceRemove();
				break;
			case 5:
				accsr.updateAddress();;
				break;
			case 6:
				accsr.Transactions();
				break;
			
			}
				
			System.out.println("Do you want to continue(Y/N");
			choice=sc.next();

		}
}
}
