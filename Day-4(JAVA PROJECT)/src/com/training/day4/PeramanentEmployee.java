package com.training.day4;

public class PeramanentEmployee extends Employee {
	private String dateofjoining;
	private double salary;
	@Override
	public void accept() {
		super.accept();
		System.out.println("Enter the date of joioning");
		dateofjoining=sc.next();
		System.out.println("Enter the salary");
		salary=sc.nextDouble();
	}
	public void display() {
		super.display();
		System.out.println("The Employee date of joining is "+ dateofjoining);
		System.out.println("The Employee salary is "+ salary);


	}
	public static void main(String rgs[]) {
		PeramanentEmployee pemp = new PeramanentEmployee();
		pemp.accept();
		pemp.display();
	}
	
}
