package com.training.day9.sorting;

public class Employee implements Comparable<Employee> {
	private int employeeid;
	private String employeename;
	private double salary;
	public Employee() {
		
	}
	public Employee(int employeeid,String employeename,double salary) {
		this.employeeid=employeeid;
		this.employeename=employeename;
		this.salary=salary;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee o) {
		//return o.employeename.compareTo(this.employeename);
		return this.employeename.compareTo(o.employeename);
	}
}
