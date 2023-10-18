package com.training.day8.activity;

import java.util.*;

public class SoftwareMain {
	Set<User> setuser;
	Scanner sc;
	public SoftwareMain() {
		setuser = new HashSet<User>();
		sc= new Scanner(System.in);
	}
	public void insertuser() {
		System.out.println("Enter the  no of user u want to enter ");
		int noofuser =sc.nextInt();
		for(int x=0;x<noofuser;x++) {
			User u = new User();
			System.out.println("Enter the type of User");
			u.setType(sc.next());
			System.out.println("Enter the User id ");
			u.setUserid(sc.nextInt());
			System.out.println("Enter the User name ");
			u.setUsername(sc.next());
			System.out.println("Enter the User Password ");
			u.setPassword(sc.next());
			setuser.add(u);
		}
	}
	public void checkUser() {
		System.out.println("Enter the Username and password to  check if it exist");
		String usernm =sc.next();
		String psswrd =sc.next();
		boolean isfalse = false;
		for(User u:setuser ) {
			if(usernm.equals(u.getUsername()) && psswrd.equals(u.getPassword())) {
				isfalse=true;

				if(u.getType().equals("admin")) {
					System.out.println("Go to admin page");
				}
				else {
					System.out.println("Go to user page");

				}
			}
		
			}
			if(isfalse) {
				
				System.out.println("User is valid");
			}
			else {
				System.out.println ("User is invalid");
			}
		}
	public void navigate() {
		System.out.println("Enter the type of user");
		String type=sc.next();
		for(User u:setuser ) {
		 
			if(type.equals(u.getType())){
				System.out.println("GO to admin page");
				break;
			}
			else {
				System.out.println("GO to User page");

			}
			}
		}
	
	
	public static void main(String[] args) {
		SoftwareMain sftmain = new SoftwareMain();
		sftmain.insertuser();
		sftmain.checkUser();
		//sftmain.navigate();
	}
}
