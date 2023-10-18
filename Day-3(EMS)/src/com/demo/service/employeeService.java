package com.demo.service;

import com.demo.Dao.employeeDao;

public class employeeService {
	private employeeDao empdao;
	public employeeService(){
		empdao= new employeeDao();
	}
	public void insertDetails() {
		empdao.insert();
	}
	public void deleteDetails() {
		empdao.delete();
	}
	public void updateDetails() {
		empdao.update();
	}
	public void show() {
		empdao.display();
	}
}
