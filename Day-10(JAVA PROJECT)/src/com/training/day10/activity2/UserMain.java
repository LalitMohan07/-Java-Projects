package com.training.day10.activity2;
import java.util.*;
public class UserMain {
	List<User> userlist;
	Scanner sc;
	public UserMain() {
		userlist = new LinkedList<User>();
		sc= new Scanner(System.in);
	}
	public void accept() {
		System.out.println("Enter the total no of user u want to have ");
		int noofuser =sc.nextInt();
		for(int x=0;x<noofuser;x++) {
			User u= new User();
			System.out.println("Enter the login id ");
			u.setLoginid(sc.nextInt());
			System.out.println("Enter the User name ");
			u.setUsername(sc.next());
			System.out.println("Enter the password "); 
			u.setPassword(sc.next());
			userlist.add(u);
		}
		
	}
	public void check() {
		System.out.println("Enter the user id u want to check");
		int checkid=sc.nextInt();
		System.out.println("ENter the password");
		String psswrd=sc.next();
		userlist.stream().filter(ulist->(ulist.getLoginid()==(checkid))&&(ulist.getPassword().equals(psswrd))).forEach(data->{
			System.out.println("User is valid");
		});;
	}
	public static void main(String[] args) {
		UserMain umain = new UserMain();
		umain.accept();
		umain.check();
	}
}
