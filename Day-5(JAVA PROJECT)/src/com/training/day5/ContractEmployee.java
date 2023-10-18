package com.training.day5;

public class ContractEmployee extends Employee {
	private double contSalary;
	private double contTime;
	@Override
	public void accept() {
		super.accept();
		System.out.println("Enter the Contract Employee Salary ");
		contSalary = sc.nextDouble();
		System.out.println("Enter the Contract Employee Time ");
		contTime= sc.nextDouble();

	}
	@Override
	public void display() {
		super.display();
		System.out.println("The salary of Contract Employee is "+contSalary);
		System.out.println("The  Contract Time of Employee is "+contTime);
	}
	@Override
	public void calculateSalary() {
		contSalary=contSalary*contTime;
		System.out.println("The Updated Salary of contract Employee is "+contSalary);
	}
}
