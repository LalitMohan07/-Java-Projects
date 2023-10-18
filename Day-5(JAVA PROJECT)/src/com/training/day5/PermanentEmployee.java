package com.training.day5;

public class PermanentEmployee extends Employee {
	private double salary;
	@Override
	public void accept() {
		super.accept();
		System.out.println("Enter the Employee Salary ");
		salary = sc.nextDouble();
	}
	@Override
	public void display() {
		super.display();
		System.out.println("The salary of Permanent Employee is "+salary);
	}
	@Override
	public void calculateSalary() {
		salary=salary*12;
		System.out.println("The Annual Salary of permanent Employee is "+salary);
	}

}
