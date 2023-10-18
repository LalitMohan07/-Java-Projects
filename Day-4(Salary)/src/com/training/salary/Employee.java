package com.training.salary;

import java.util.Scanner;

public class Employee {
	private long employeeId;
	private String employeeName;
	private String employeeAddress;
	private long employeePhone;
	protected double basicSalary;
	protected double specialAllowance=250.80;
	protected double Hra = 1000.50;
	private Scanner sc;
	public Employee() {
		/*sc= new Scanner(System.in);
		System.out.println("Enter the Employee Id");
		employeeId=sc.nextLong();
		System.out.println("Enter the Employee Name");
		employeeName=sc.next();
		System.out.println("Enter the Employee Address");
		employeeAddress=sc.next();
		System.out.println("Enter the Employee phone");
		employeePhone=sc.nextLong();*/



	}
	public Employee(long id, String name,String address,long phone) {
		this.employeeId=id;
		this.employeeName=name;
		this.employeeAddress=address;
		this.employeePhone=phone;
	}
	public void display() {
		System.out.println("Name of the employee is "+employeeName);
		System.out.println("Id of the employee is "+employeeId);
		System.out.println("Address of the employee is "+employeeAddress);
		System.out.println("phone of the employee is "+employeePhone);

	}
	public void calculateSalary() {
		System.out.println("The Basic Salary is "+basicSalary);
		double salary;
		salary=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*Hra/100);
		System.out.println("The salary is "+salary);
				
	}
	public void  calculateTransportAllowance () {
		System.out.println("The Transport Allowance is ");

		double transportAllowance = 10/100*basicSalary;
		System.out.println(transportAllowance);

	}
}
