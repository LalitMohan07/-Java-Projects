package client;

import java.util.Scanner;

import service.MystoreService;

public class MainMenu {
	MystoreService myservice;
	int choice;
	String ch ="y";
	Scanner sc;
	public MainMenu() {
		myservice=new MystoreService();
		sc= new Scanner(System.in);
	}public void Menu() throws Exception {
		while(ch.equals("y")) {
			
			System.out.println("1.Insert Items");
			System.out.println("2.Insert Customer Details");
			System.out.println("3.Insert Purchase details");
			System.out.println("4.Show Item details");
			System.out.println("5.Show Customer details");
			System.out.println("6.Show Purchase details");
			System.out.println("7.Show Concession price of a Item");

			
			choice = sc.nextInt();
			switch(choice){
			case 1:
				myservice.insertitem();
				break;
			case 2:
				myservice.insertCustomerDetails();
				break;
			case 3:
				myservice.insertPurchaseDetails();
				break;
			case 4:
				myservice.showItemDetails();
				break;
			case 5:
				myservice.showCustomerDetails();
				break;
			case 6:
				myservice.showPurchaseDetails();
				break;
			case 7:
				myservice.showConcessionPrice();
				break;
			}
			System.out.println("Do you want to continue(Y/N");
			ch=sc.next();
		}
	}
}
