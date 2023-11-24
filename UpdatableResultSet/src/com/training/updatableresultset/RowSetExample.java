package com.training.updatableresultset;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;
public class RowSetExample {
	JdbcRowSet rowset;
	public RowSetExample() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		rowset=RowSetProvider.newFactory().createJdbcRowSet();
		rowset.setUrl("jdbc:mysql://localhost:3306/Movieconnect");
		rowset.setUsername("root");
		rowset.setPassword("Lalit@image");
		
	}
	public void retrieveData() throws SQLException {
		rowset.setCommand("select * from movie");
		rowset.execute();
		while(rowset.next()) {
			System.out.println("THe movie name is "+rowset.getString(2));
			System.out.println("THe movie price  is "+rowset.getDouble(4));

		}
	}
	public static void main(String[] args) {
		RowSetExample rwset;
		try {
			rwset = new RowSetExample();
			rwset.retrieveData();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
