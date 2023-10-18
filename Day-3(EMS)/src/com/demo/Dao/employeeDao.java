package com.demo.Dao;

import java.util.Scanner;

import com.demo.pojo.employee;

public class employeeDao {
	private employee emparr[];
	Scanner sc;
	public employeeDao() {
		sc = new Scanner(System.in);
	}
	public void insert() {
		System.out.println("Enter no of Employees you want to have");
		int noofemployee=sc.nextInt();
		emparr= new employee[noofemployee];
		for(int x=0;x<emparr.length;x++) {
			emparr[x]= new employee();
			System.out.println("Enter Employee Id ");
			emparr[x].setEmpid(sc.nextInt());
			System.out.println("Enter Employee Name ");
			emparr[x].setEmpname(sc.next());
			System.out.println("Enter Employee Salary ");
			emparr[x].setSalary(sc.nextDouble());


		}
	}public void update() {
		System.out.println("Enter the employee id you want to update");
		int empid = sc.nextInt();
		for(employee e:emparr) {
			if(empid==e.getEmpid()) {
				e.setEmpid(sc.nextInt());
			}
		}
		
		
	}
	public void delete() {
		System.out.println("Enter the employee id you want to delete  ");
		int empid=sc.nextInt();
		employee edelete= null;
		int val=0;
		for(int x=0;x<emparr.length;x++) {
			if(emparr[x].getEmpid()==empid) {
				emparr[x]=null;
			}
			
		}
	}
	public void display() {
		for(employee e:emparr) {
			if(e!=null) {
			System.out.println("Employee id is "+e.getEmpid());
			System.out.println("Employee name is "+e.getEmpname());
			}
		}
	}
}
