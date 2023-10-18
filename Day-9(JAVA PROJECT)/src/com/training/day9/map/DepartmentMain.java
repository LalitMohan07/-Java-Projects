package com.training.day9.map;

import java.util.*;

public class DepartmentMain {
	private Map<Integer,Employee> empmap; 
	private Scanner sc;
	private Department deptobj;
	public  DepartmentMain() {
		sc= new Scanner(System.in);
		empmap= new HashMap<Integer,Employee>();
		deptobj= new Department();
	}
	public void insert() {
		System.out.println("Enter the Department code ");
		deptobj.setDeprtcode(sc.nextInt());
		System.out.println("Enter the Department name ");
		deptobj.setDeptname(sc.next());
		System.out.println("Enter the Department city ");
		deptobj.setCity(sc.next());
		System.out.println("Enter the no of employee u want to have ");
		int noofemployee = sc.nextInt();
		for(int x=1;x<=noofemployee;x++) {
			Employee e= new Employee();
			System.out.println("Enter the id employee ");
			int eid=sc.nextInt();
			e.setEmployeeid(eid);
			System.out.println("Enter the  name employee ");
			e.setEmployeename(sc.next());
			System.out.println("Enter the salary employee ");
			e.setSalary(sc.nextDouble());
			empmap.put(eid, e);
		
		}
		deptobj.setEmployeemap(empmap);
	}
	public void display() {
		System.out.println("THe Department  code is "+deptobj.getDeprtcode());
		System.out.println("THe Department  name is "+deptobj.getDeptname());
		System.out.println("THe Department  city is "+deptobj.getCity());


	
			Map<Integer, Employee>empd= deptobj.getEmployeemap();
			Set<Map.Entry<Integer, Employee>> mapset =empd .entrySet();
			for(Map.Entry<Integer, Employee> empmap:mapset) {
				Employee e=empmap.getValue(); 
				System.out.println("THe Department  code is "+e.getEmployeeid());
				System.out.println("THe Department name is "+e.getEmployeename());

			}

		

	}
	public void calculateSalary() {
		double totalsalary=0;
		Map<Integer, Employee>empd= deptobj.getEmployeemap();
		Set<Map.Entry<Integer, Employee>> mapset =empd .entrySet();
		for(Map.Entry<Integer, Employee> empmap:mapset) {
			Employee e=empmap.getValue(); 
			 totalsalary =e.getSalary()+totalsalary;		
			}
		System.out.println("The total salary of all employee in the map is "+totalsalary);

	}
	public void calaculateBonus() {
		double bonus=0;
		Map<Integer, Employee>empd= deptobj.getEmployeemap();
		Set<Map.Entry<Integer, Employee>> mapset =empd .entrySet();
		for(Map.Entry<Integer, Employee> empmap:mapset) {
			Employee e=empmap.getValue(); 
			 if(e.getSalary()>50000 && e.getSalary()<70000) {
				 bonus=e.getSalary()*20/100;
				 System.out.println("The bonus is "+bonus);
			 }
			 else if(e.getSalary()>30000 && e.getSalary()<50000) {
				 bonus=e.getSalary()*15/100;
				 System.out.println("The bonus is "+bonus);
	
			 }
			 else if(e.getSalary()<30000) {
				 bonus=e.getSalary()*10/100;
				 System.out.println("The bonus is "+bonus);
	
			 }
			}
		
		
	}
	public static void main(String[] args) {
		DepartmentMain dept = new DepartmentMain();
		dept.insert();
		dept.display();
		dept.calculateSalary();
		dept.calaculateBonus();
	}
}
