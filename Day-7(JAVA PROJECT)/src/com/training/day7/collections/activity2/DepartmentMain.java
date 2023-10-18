package com.training.day7.collections.activity2;

import java.util.*;
import java.util.Scanner;

public class DepartmentMain  {
 Scanner sc;
 private Department dept;
 private List<Employee> emp;
 
 
 public DepartmentMain() {
	 emp=new ArrayList<Employee>();
	 sc=new Scanner(System.in);
	 dept= new Department();
	 
 }
 public void accept() {
	 
		System.out.println("Enter the Department id ");
		dept.setDepartmentid(sc.nextInt());
		 System.out.println("Enter the department name ");
			dept.setDepartmentname(sc.next());
		 System.out.println("Enter the number of employee u want to have in this department ");
		 int noofemployee=sc.nextInt();
		 for(int i =0;i<noofemployee;i++) {
			 Employee e = new Employee();
			 System.out.println("Enter the Employeeid ");
			 e.setEmployeeid(sc.nextInt());
			 System.out.println("Enter the Employee name ");
			 e.setEmployeename(sc.next());
			 System.out.println("Enter the Employee salary ");
			 e.setSalary(sc.nextDouble());
			 emp.add(e);
		 }
		 dept.setEmp(emp);
	}
 public void display() {
	 System.out.println("Department code is "+dept.getDepartmentid());
	 System.out.println("Department Name is "+dept.getDepartmentname());
	 List<Employee> elist = dept.getEmp();
	 for(Employee e:elist) {
		 System.out.println("Employee name is "+e.getEmployeename());
	 }

 }
 public static void main(String[] args) {
	DepartmentMain deptmain = new DepartmentMain();
	deptmain.accept();
	deptmain.display();
}
}
