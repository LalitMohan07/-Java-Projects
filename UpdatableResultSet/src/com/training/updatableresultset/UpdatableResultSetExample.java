package com.training.updatableresultset;
import java.sql.*;

import connect.DataConnect;
public class UpdatableResultSetExample {
	public static void main(String[] args) throws SQLException {
		Connection con = DataConnect.getConnect();
		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = st.executeQuery("select * from movie");
		rs.next();
		rs.updateInt(1, 103);
		rs.updateRow();
		System.out.println("1 Row updated....");
		rs.moveToInsertRow();
		rs.updateInt(1, 104);
		rs.updateString(2,"Iron man");
		rs.updateInt(3, 2);
		rs.updateDouble(4,600);
		rs.insertRow();
		rs.absolute(3);
		rs.updateInt(3,3);
		rs.updateRow();
		System.out.println("Data Updated...");
		System.out.println("1 ROW inserted");
		System.out.println("After updation...");
		con.close();
		
	}
}
