package com.training.connect;
import java.sql.*;
public class DataConnect {
	private static Connection con;
	private DataConnect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mike","root","Lalit@image");
			System.out.println("connection established");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static Connection getConnect() {
		DataConnect c2 = new DataConnect();
		return con;
	}
	public static void main(String[] args) {
		getConnect();
	}
}
