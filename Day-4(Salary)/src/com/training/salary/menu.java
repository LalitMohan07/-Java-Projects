package com.training.salary;
import java.util.Scanner;
public class menu {
	Manager mn1;
	Trainee tr1;
	public menu() {
		 mn1= new Manager();
		 tr1= new Trainee();
	}
public void displayMenu() {
	Scanner sc = new Scanner(System.in);
	String choice ="y";
	int ch=0;
	while(choice.equals("y")) {
		System.out.println("1. Display the details of Manager");
		System.out.println("2. Display the details of Trainee");
        ch=sc.nextInt();
        switch(ch) {
        case 1:
        	mn1 = new Manager(101,"Lalit","DElhi",789456,20000);
        	mn1.display();
    		mn1.calculateSalary();
    		mn1.calculateTransportAllowance();
    		break;
        case 2:
        	 tr1 = new Trainee(1000,"MIke","Mumbai",12543,15000);
    		tr1.display();
    		tr1.calculateSalary();
    		tr1.calculateTransportAllowance();
        	
        }
        System.out.println("Do you want to continue(Y/N");
		choice=sc.next();
	}
}
}
