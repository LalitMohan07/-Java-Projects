package com.training.day9.sorting.comparator;
import java.util.*;
public class EmployeeMain {
	public static void main(String[] args) {
		//List<Employee> emplist = new ArrayList<Employee>();
		Set<Employee > empset= new TreeSet<Employee>(new sortByNameComparator()); 
		Employee e1 = new Employee(1,"Lalit",50000);
		Employee e2 = new Employee(2,"Ak",70000);
		Employee e3= new Employee(3,"SSd",80000);
		empset.add(e1);
		empset.add(e2);
		empset.add(e3);
		//Collections.sort(emplist,new sortByNameComparator());
		System.out.println("After sorting by name ");
		for(Employee e:empset)
		{
			System.out.println("Employee id is "+e.getEmployeeid());
			System.out.println("Employee name is "+e.getEmployeename());
					}
		
		//Collections.sort(emplist,new sortByEmpidComparator());
		System.out.println("After sorting by id ");
		for(Employee e:empset)
		{
			System.out.println("Employee id is "+e.getEmployeeid());
			System.out.println("Employee name is "+e.getEmployeename());
					}
		System.out.println("After sorting by Salary ");
		for(Employee e:empset)
		{
			System.out.println("Employee Salary is "+e.getSalary());
			System.out.println("Employee name is "+e.getEmployeename());
					}


	}
}
