package com.training.dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.training.connect.DataConnect;

import java.sql.*;
public class StudentData {
	private java.sql.Connection con;
	private java.sql.Statement stat;
	static boolean count = false;
	public StudentData() {
		con = DataConnect.getConnect();
	}
	public void insertData() {
		try {
			stat= con.createStatement();
			int result = stat.executeUpdate("Insert into student values(5,'mahesh',78,'vizag',102)");
			if(result>0) {
				System.out.println("Data inserted successfully");
			}
			else {
				System.out.println("Not inserted");
			}
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	public void deleteData(int stdcode) {
		try {
			stat= con.createStatement();
			int result=stat.executeUpdate("delete from student where studentid="+stdcode+"");
			if(result>0) {
				System.out.println("Data deleted");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void updateData(int stdid,int score) {
		try {
			stat=con.createStatement();
			int result = stat.executeUpdate("update student set score="+score+" where studentid="+stdid+"");
			if(result>0) {
				System.out.println("Updated successfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void retrieveData() {
		try {
			stat=con.createStatement();
			ResultSet result = stat.executeQuery("select * from student");
			while(result.next()) {
				System.out.println("Student id is "+result.getInt(1));
				System.out.println("Student name is "+result.getString(2));
				System.out.println("Student score  is "+result.getInt(3));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*public void checkUser(String usrname,String passwrd) {
		try {
			stat = con.createStatement();
			 //boolean static count=false;
			ResultSet result = stat.executeQuery("select * from UserDetails" );
			while(result.next()) {
				if(result.getString(2).equals(usrname)&& result.getString(3).equals(passwrd)){
					count=true;
					break;
				}
				else {
					count= false;
				}
				
			}
			if(count) {
				System.out.println("user is valid");

			}
			else {
				System.out.println("user is not valid");

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}*/
	public void checkUser(String usr,String pass)  {
		try {
			stat=con.createStatement();
			ResultSet result =stat.executeQuery("select userid,username,password from UserDetails where username='"+usr+"' and password='"+pass+"'");
			if(result.next()) {
				System.out.println("valid user");
			}
			else {
				System.out.println("not valid");

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		StudentData std = new StudentData();
		//std.insertData();
		//std.deleteData(4);
		//std.updateData(1,60);
		//std.retrieveData();
		std.checkUser("Jordan","jordan");
	}
	
}
