package com.training.menu;

import java.util.Scanner;

import com.training.service.Bookservice;

public class Bookmenu {
private Bookservice bservice;
int choice;
String ch ="y";
private Scanner sc;
public Bookmenu() {
	bservice= new Bookservice();
	sc= new Scanner(System.in);
}
	public void Menu() {
		while(ch.equals("y")) {
			
			System.out.println("1.Insert Books");
			System.out.println("2.Delete Books");
			System.out.println("3.Update Books");
			System.out.println("4.view Books");

			choice = sc.nextInt();
			switch(choice){
			case 1:
				bservice.InsertBook();
				break;
			case 2:
				bservice.DeleteBook();

				break;
			case 3:
				bservice.UpdateBook();

				break;
			case 4:
					bservice.ViewBooks();

					break;
	}
			System.out.println("Do you want to continue(Y/N");
			ch=sc.next();
}
}
}
