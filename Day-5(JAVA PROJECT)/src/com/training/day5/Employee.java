package com.training.day5;
import java.util.*;
public abstract class Employee {
	private int empid;
	private String empname;
	protected Scanner sc;
	public Employee() {
		sc = new Scanner(System.in);
	}
	public void accept() {
		System.out.println("Enter the ID of the Employee ");
		empid=sc.nextInt();
		System.out.println("ENter the Employee Name ");
		empname=sc.next();
		
	}
	public void display() {
		System.out.println("The Employee ID is "+empid);
		System.out.println("The Employee Name is "+empname);

	}
	public abstract void calculateSalary();
}
