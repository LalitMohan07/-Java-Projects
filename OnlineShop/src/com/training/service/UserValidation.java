package com.training.service;
import java.util.*;
import java.sql.*;

import com.training.connect.DataConnect;
import com.training.dao.ProductInformation;
import com.training.dao.UserInformation;
import com.training.pojo.Product;
import com.training.pojo.User;
public class UserValidation {
	Scanner sc;
	ProductInformation pservice ;
	UserInformation uservice;
	Connection con;
	PreparedStatement stat;
	
	public UserValidation() {
		sc= new Scanner(System.in);
		pservice= new ProductInformation();
		uservice= new UserInformation();
		con=DataConnect.getConnect();
	}
	public void userRegister() throws SQLException {
		//System.out.println("ENter the no of  user u want to input");
		int noofinput=1;
		for(int x=0;x<noofinput;x++) {
			//User n= new User();
			stat=con.prepareStatement("insert into User values (?,?,?,?,?)");
			System.out.println("Enter the user name ");
			stat.setString(1,sc.next());
			System.out.println("Enter the user email ");
			stat.setString(2,sc.next());
			System.out.println("ENter the Password");
			stat.setString(3,sc.next());
			System.out.println("Enter the usertype");
			stat.setString(4,sc.next());
			stat.setInt(5, 100);
			 System.out.println("100 supercoins added to your wallet");
			 
			int result=stat.executeUpdate();
			
			if(result>0) {
				System.out.println("user inserted");
			}
			//userlist.add(n);
		}
		
	}
	public void adminvalidation() throws SQLException {
		System.out.println("Enter the Admin name ");
		String usr = sc.next();
		System.out.println("ENter the Password");
		String psswrd = sc.next();
		
		if(usr.equals("admin")&& psswrd.equals("admin")) {
			System.out.println("Admin logged in successfully");
			String choice="y";
			int ch=0;
			while(choice.equals("y")) {
				System.out.println("Enter your choice ");
				System.out.println("1.Insert the products ");
				System.out.println("2.Search product by productid ");
				System.out.println("3.Products by category ");
				System.out.println("4. search Products by name ");
				System.out.println("5.check the total amount");
				System.out.println("6.Display the profit ");
				System.out.println("7.Exit ");

				ch=sc.nextInt();
				switch(ch) {
				case 1:
				  pservice.insertdetails();
					
					break;
				
				  case 2:
					  pservice.searchbyproductid(); 
					  break;
				  case 3:
				  pservice.listbycategory(); break;
				  case 4: 
					  pservice.searchbyname(); break;
				  
				  case 5: 
					  pservice.totalamount(); break; 
				  case 6: 
					  pservice.profitamt(); break;
				  case 7:
				  
				  uservalidation(); break;
				 
				
				}
					
				System.out.println("Do you want to continue(Y/N");
				choice=sc.next();
	
				}
			
		}
	}
	public void uservalidation() throws SQLException {
		System.out.println("Enter the User name ");
		String usr = sc.next();
		System.out.println("Enter the Password");
		String psswrd = sc.next();

		//if(u.getUsername().equals(usr)&& u.getPassword().equals(psswrd)) {}
			stat=con.prepareStatement("select * from User where username = ? && password = ?");
			stat.setString(1,usr);
			stat.setString(2, psswrd);
			ResultSet result=stat.executeQuery();
			while(result.next()) {
				System.out.println("User logged in successfully");
				String choice="y";
				int ch=0;
				while(choice.equals("y")) {
					System.out.println("Enter your choice ");
					System.out.println("1.Display the details of product");
					System.out.println("2.Allow user to register ");
					System.out.println("3.Avail 100 supercoins ");
					System.out.println("4. filter on price and category ");
					System.out.println("5. Add the products to the cart and display the bill ");

					System.out.println("6.Exit ");
					
					
					ch=sc.nextInt();
					switch(ch) {
					case 1:
						pservice.listbycategory();
						
						break;
					case 2:
						System.out.println("--------------------U need to register--------------");
						userRegister();

						break;
					case 3:
						//userRegister();
						System.out.println("100 Supercoins for the new user as a welcome bonus has been credited");
						break;
					case 4:
						uservice.categoryandprice();
						break;
					case 5:
						uservice.bill();
						break;
					case 6:
						System.out.println("Thank you fo shopping with us.....visit Again!");
						System.exit(0);
						break;
						
					}
			
					
				System.out.println("Do you want to continue(Y/N");
				choice=sc.next();
	
				}

			
		
		

		
	}
	}
}
