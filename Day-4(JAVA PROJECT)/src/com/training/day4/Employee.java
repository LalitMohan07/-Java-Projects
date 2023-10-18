package com.training.day4;
import java.util.Scanner;
public class Employee {
	private int empid;
	private String empname;
	protected Scanner sc;
	public Employee() {
		sc= new Scanner (System.in);
	}
	void accept() {
		System.out.println("Enter Employee Id ");
		empid=sc.nextInt();
		System.out.println("Enter Employee Name ");
		empname= sc.next();

		
	}
	void display() {
		System.out.println("The Employee id is "+ empid);
		System.out.println("The Employee name is "+ empname);

	}
}
