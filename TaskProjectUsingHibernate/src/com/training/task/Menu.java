package com.training.task;

import java.util.Scanner;

public class Menu {
	private Scanner sc;
	Taskservice taskser = new Taskservice();
	public Menu() {
		sc=new Scanner(System.in);
		taskser = new Taskservice();
	}
	public void displayMenu() {
		int ch=0;
		String choice="y";
		while(choice.equals("y")) {
			System.out.println("1. Insert Task Details");
			System.out.println("2. Delete Task Details");
			System.out.println("3. Update Task Details");
			System.out.println("4. View Task Details");
			
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				taskser.insertTaskDetails();
				break;
			case 2:
				taskser.deleteTaskDetails();
				break;
			case 3:
				taskser.updateTaskDetails();
				break;
			case 4:
				taskser.viewTaskDetails();
				break;
			}
			System.out.println("Do you want to continue(Y/N");
			choice=sc.next();
			

		}
	}
}
