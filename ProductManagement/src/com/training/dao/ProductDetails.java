package com.training.dao;
import java.sql.*;
import java.util.Scanner;

import com.training.connect.DataConnect;
public class ProductDetails {
  Connection con;
  PreparedStatement stat;
  Scanner sc;
  public ProductDetails() {
	  con=DataConnect.getConnect();
	  sc= new Scanner(System.in);
  }
  public void insertData() {
	  System.out.println("ENter the no of products u want to add ");
	  int noofproduct = sc.nextInt();
	  try {
		stat= con.prepareStatement("insert into productDetails (productname,quantity,category)values(?,?,?)");
		for(int x=1;x<=noofproduct;x++) {
			//System.out.println("Enter product id ");
			//stat.setInt(1, sc.nextInt());
			System.out.println("Enter product name ");
			stat.setString(1, sc.next());
			//System.out.println("Enter product price ");
			//stat.setDouble(3, sc.nextDouble());
			System.out.println("Enter product quantity ");
			stat.setInt(2, sc.nextInt());
			System.out.println("Enter product category ");
			stat.setString(3, sc.next());
			int result=stat.executeUpdate();
			if(result>0) {
				System.out.println("Inserted successfully");
			}
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
	  public void deleteData(int productid) {
		  try {
			stat=con.prepareStatement("delete from productDetails where productcode=(?)" );
			stat.setInt(1, productid);
			int result= stat.executeUpdate();
			if(result>0) {
				System.out.println("deleted successfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	  
	  
	  
  
  public static void main(String[] args) {
	ProductDetails pdt = new ProductDetails();
	//pdt.insertData();
	pdt.deleteData(101);
}
}
