package com.training.salary;

public class Manager extends Employee{
	public Manager() {
		
	}
	public Manager(long id,String name,String address,long phone,double salary) {
		super(id,name,address,phone);
		basicSalary=salary;
	}
	public void calculateTransportAllowance() {
		System.out.println("The transport allowance for manager is ");
		 double transportAllowance = 15*basicSalary /100;
			System.out.println(transportAllowance);
																																																																																																																																																																																																																																																												
			
	}
	
}
