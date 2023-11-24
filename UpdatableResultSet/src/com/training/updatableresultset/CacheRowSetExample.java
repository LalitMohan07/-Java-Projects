package com.training.updatableresultset;

import java.sql.SQLException;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

public class CacheRowSetExample {
	CachedRowSet rowset;
	public CacheRowSetExample() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		rowset=RowSetProvider.newFactory().createCachedRowSet();
		rowset.setUrl("jdbc:mysql://localhost:3306/Movieconnect?relaxAutoCommit=true");
		rowset.setUsername("root");
		rowset.setPassword("Lalit@image");
		
	}
	public void operation() throws SQLException {
		rowset.setCommand("Select * from movie");
		rowset.execute();
		rowset.next();
		rowset.moveToInsertRow();
		
		rowset.updateInt(1, 201);
		rowset.updateString(2, "Captain America");
		rowset.updateInt(3, 3);
		rowset.updateDouble(4, 550);
		rowset.insertRow();
		rowset.moveToCurrentRow();
		rowset.acceptChanges();
		System.out.println("Row inserted");
	}
	public static void main(String[] args) {
		CacheRowSetExample rwst;
		try {
			rwst = new CacheRowSetExample();
			rwst.operation();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
