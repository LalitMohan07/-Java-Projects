package com.training.dao;
import java.sql.*;

import com.training.connect.DataConnect;
public class MovieBatchUpdate {
	
		 private Connection con;
		 private PreparedStatement stat;
		 public MovieBatchUpdate()
		 {
		  con=DataConnect.getConnect();
		  
		 }
		 public void insertMultipleData()throws SQLException
		 {
		  con.setAutoCommit(false);
		  stat=con.prepareStatement("insert into movie values(?,?,?,?)");
		  stat.setInt(1, 24);
		  stat.setString(2, "abc");
		  stat.setDouble(3,900);
		  stat.setInt(4, 2);
		  stat.addBatch();
		  stat.setInt(1, 25);
		  stat.setString(2, "xyz");
		  stat.setDouble(3, 700);
		  stat.setInt(4, 3);
		  int result[]=stat.executeBatch();
		  if(result[0]>0)
		  {
		   System.out.println("inserted ");
		  }
		  con.setAutoCommit(true);
		 }

}
