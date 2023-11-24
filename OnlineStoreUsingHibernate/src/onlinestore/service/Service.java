package onlinestore.service;

import java.sql.SQLException;

import onlinestore.dao.UserInformation;
import onlinestore.entity.User;


public class Service {
	
	UserInformation uin ;
	User u1= new User();
	
	  public Service() { 
		  
		  uin=new UserInformation();
		  }
	  public void userregister()  {
		  uin.register(u1); } 
	  public void adminvalidation() {
		  uin.Validation(); }
	  public void uservalidation()  {
		  uin.Validation(); }
	 
}
