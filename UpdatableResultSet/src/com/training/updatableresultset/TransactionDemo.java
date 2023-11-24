package com.training.updatableresultset;
import java.sql.*;
import java.util.*;

import connect.DataConnect;
public class TransactionDemo {
	private Connection con;
	private PreparedStatement stat;
	private Scanner sc;
	public TransactionDemo() {
		sc= new Scanner(System.in);
		con=DataConnect.getConnect();
		
	}
	public void updateBalance() throws SQLException {
		con.setAutoCommit(false);
		double balance1=0;
		stat= con.prepareStatement("select balance from Account where customercode=1");
		ResultSet resultdata= stat.executeQuery();
		if(resultdata.next()) {
			balance1=resultdata.getDouble(1);
		}
		System.out.println("Enter the amount which u want to withdraw ");
		double amtdata = sc.nextDouble();
		if(amtdata>balance1) {
			con.rollback();
		}
		else {
			stat=con.prepareStatement("update Account set balance = balance-"+amtdata+"where customercode=1");
			int result = stat.executeUpdate();
			if(result>0) {
				System.out.println("First account updated");
			}
			stat=con.prepareStatement("update Account set balance = balance+"+amtdata+"where customercode=2");
			int result2 = stat.executeUpdate();
			if(result2>0) {
				System.out.println("Second account updated");
			}
			con.setAutoCommit(true);
		}
	}
	public static void main(String[] args) {
		TransactionDemo trnsc = new TransactionDemo();
		try {
			trnsc.updateBalance();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
