package com.training.day5;

import java.util.Scanner;

public class AppMain {
	
	public static void main(String[] args) {
		Employee emp;

		Scanner sc= new Scanner(System.in);
		System.out.println("1. Permanent Employee");
		System.out.println("2. Contract Employee");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			emp= new PermanentEmployee();
			emp.accept();
			emp.display();
			emp.calculateSalary();
			break;
		case 2:
			emp= new ContractEmployee();
			emp.accept();
			emp.display();
			emp.calculateSalary();
			
		}

	}
}
