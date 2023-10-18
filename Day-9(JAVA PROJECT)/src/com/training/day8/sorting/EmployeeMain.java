package com.training.day8.sorting;

import java.util.*;

public class EmployeeMain {
	public static void main(String[] args) {
		
		List <Employee> emplist= new LinkedList<>();
		
			Employee e1= new Employee(1,"lalit",25000);
			Employee e2= new Employee(2,"mike",30000);
			Employee e3= new Employee(3,"john",45000);
			emplist.add(e1);
			emplist.add(e2);
			emplist.add(e3);
			Collections.sort(emplist);
			System.out.println("After Sorting ");
			for(Employee e:emplist) {
				System.out.println("Employee id is "+e.getEmployeeid());
				System.out.println("Employee name is "+e.getEmployeename());
				System.out.println("Employee salary is "+e.getSalary());

			}

			
	}
	}

