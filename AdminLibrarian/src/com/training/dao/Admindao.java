package com.training.dao;
import java.sql.*;
import java.util.*;

import com.training.connect.DataConnect;
public class Admindao {
	Connection con;
	PreparedStatement stat;
	Scanner sc;
	public Admindao() {
		con=DataConnect.getConnect();
		sc=new Scanner(System.in);
	}
	public void insertDetails() throws SQLException {
		System.out.println("Enter the no of Librarian u want to add");
		int nooflib =sc.nextInt();
		stat= con.prepareStatement("insert into Admin values(?,?)");
		for(int x=1;x<=nooflib;x++) {
			System.out.println("Enter the Librarian id");
			stat.setInt(1, sc.nextInt());
			System.out.println("ENter the Librarian name");
			stat.setString(2, sc.next());
			int result = stat.executeUpdate();
			if(result>0) {
				System.out.println("Data inserted");
			}
		}
	}
	public void viewDetails() throws SQLException {
		stat=con.prepareStatement("select * from Admin");
		ResultSet res=stat.executeQuery();
		while(res.next()) {
			System.out.println("The Librarian id is "+res.getInt(1));
			System.out.println("The Librarian name is "+res.getString(2));
		}
	}
	public void deleteDetails() throws SQLException {
		System.out.println("Enter the Librarian id u want to delete");
		int deleteid=sc.nextInt();
		stat=con.prepareStatement("delete from Admin where librarian_id=?");
		stat.setInt(1, deleteid);
		int res= stat.executeUpdate();
		if(res>0) {
			System.out.println("Data Deleted");
		}
	}

}
