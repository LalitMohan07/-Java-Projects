package com.training.salary;

public class Trainee extends Employee {
public Trainee() {
		
	}
public Trainee(long id,String name,String address,long phone,double salary) {
	super(id,name,address,phone);
	this.basicSalary=salary;
}
 public void calculateTransportAllowance() {
	
	System.out.println("The transport allowance for Trainee is ");
	 double transportAllowance = 15*basicSalary /100;
		System.out.println(transportAllowance);
	

}
}
