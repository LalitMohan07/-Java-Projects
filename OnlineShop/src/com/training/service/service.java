package com.training.service;

import java.sql.SQLException;

import com.training.dao.ProductInformation;

public class service {
	private UserValidation userdao;
	
	  public service() { userdao= new UserValidation(); }
	  public void userregister() throws SQLException {
		  userdao.userRegister(); } 
	  public void adminvalidation() throws SQLException {
		  userdao.adminvalidation(); }
	  public void uservalidation() throws SQLException {
		  userdao.uservalidation(); }
	 
	
}
