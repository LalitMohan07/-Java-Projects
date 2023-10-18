package com.training.Day2;

import java.util.Scanner;
class employee{
	private int empId;
	private String empName;
	private int salary;
	private Scanner sc;
	int bonus;
	public void acceptDetails(){
		sc=new Scanner(System.in);
		System.out.println("Enter the Employee Id");
		empId=sc.nextInt();
		System.out.println("Enter the Employee Name");
		empName=sc.next();
		System.out.println("Enter the Employee Salary");
		salary=sc.nextInt();
	}
	public int calculateBonus(){

		if(salary>=30000 && salary<=50000){
			bonus = (salary*10/100);

		}
		else if(salary>=50000 && salary<=100000){
			 bonus = (salary*20/100);

		}
		return bonus;
	}
	public void display(){
		System.out.println("Employee id is"+" "+empId);
		System.out.println("Employee Name is"+" "+empName);
		System.out.println("Employee Salary is"+" "+salary);
		System.out.println("Bonus is"+" "+bonus);
	}
	public static void main(String arg[]){
	employee obj = new employee();
	obj.acceptDetails();
	obj.calculateBonus();
	obj.display();
	}
}
