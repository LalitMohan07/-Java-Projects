package com.training.day9.map;

import java.util.*;

public class Department {
	private int deprtcode;
	private String deptname;
	private String city;
	private Scanner sc;
	public Scanner getSc() {
		return sc;
	}
	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	private  Map<Integer,Employee>employeemap;
	public Map<Integer, Employee> getEmployeemap() {
		return employeemap;
	}
	public void setEmployeemap(Map<Integer, Employee> employeemap) {
		this.employeemap = employeemap;
	}
	public int getDeprtcode() {
		return deprtcode;
	}
	public void setDeprtcode(int deprtcode) {
		this.deprtcode = deprtcode;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
