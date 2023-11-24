package com.training.service;
import java.util.*;

import com.training.connect.DataConnect;
import com.training.dao.Admindao;
import com.training.dao.Librariandao;
import com.training.pojo.Librarian;

import java.sql.*;
public class AdminLibrarianValidation {
	Connection con;
	PreparedStatement stat;
	Scanner sc;
	Admindao admindao;
	Librariandao libdao;
	public AdminLibrarianValidation() {
		con=DataConnect.getConnect();
		sc= new Scanner(System.in);
		admindao= new Admindao();
		libdao= new Librariandao();
	}
	public void register() throws SQLException {
		stat=con.prepareStatement("insert into User values(?,?,?)");
		System.out.println("Enter the username");
		stat.setString(1, sc.next());
		System.out.println("Enter the password");
		stat.setString(2, sc.next());
		System.out.println("Enter the usertype");
		stat.setString(3, sc.next());
		int result=stat.executeUpdate();
		if(result>0) {
			System.out.println("user inserted");
		}

		
	} 
	public void adminValidation() throws SQLException {
		System.out.println("Enter the admin name");
		String user=sc.next();
		System.out.println("Enter the password");
		String psswrd=sc.next();
		stat=con.prepareStatement("select * from User where user_name=? and password=?");
		stat.setString(1, user);
		stat.setString(2, psswrd);
		ResultSet result = stat.executeQuery();
		while(result.next()) {
			System.out.println("Admin logged in successfully");
			String choice="y";
			int ch=0;
			while(choice.equals("y")) {
				System.out.println("Enter your choice ");
				System.out.println("1. Add Librarian ");
				System.out.println("2. View Librarian ");
				System.out.println("3. Delete Librarian ");
				System.out.println("4. Log out ");
				ch=sc.nextInt();
				switch(ch) {
				case 1:
					admindao.insertDetails();
					break;
				case 2:
					admindao.viewDetails();
					break;
				case 3:
					admindao.deleteDetails();
					break;
				case 4:
					System.exit(0);
					break;
			
				}
				System.out.println("Do you want to continue(Y/N");
				choice=sc.next();

			}
		}
	}
	public void librarianValidation() throws SQLException {
		System.out.println("Enter the user name");
		String user=sc.next();
		System.out.println("Enter the password");
		String psswrd=sc.next();
		stat=con.prepareStatement("select * from User where user_name=? and password=?");
		stat.setString(1, user);
		stat.setString(2, psswrd);
		ResultSet result = stat.executeQuery();
		while(result.next()) {
			System.out.println("Librarian logged in successfully");
			String choice="y";
			int ch=0;
			while(choice.equals("y")) {
				System.out.println("Enter your choice ");
				System.out.println("1. Add book ");
				System.out.println("2. View book ");
				System.out.println("3. issue books  ");
				System.out.println("4. view issued books ");
				System.out.println("5. Return books");
				System.out.println("6. Log out ");


				ch=sc.nextInt();
				switch(ch) {
				case 1:
					libdao.insertBook();
					break;
				case 2:
					libdao.viewBook();
					break;
				case 3:
					libdao.issueBook();
					break;
				case 4:
					libdao.viewIssuedBooks();
					break;
				case 5:
					
					libdao.returnBooks();
					break;
				case 6:
					System.exit(0);
					break;
				}
				System.out.println("Do you want to continue(Y/N");
				choice=sc.next();

		
	}
		}
	}
	
}
