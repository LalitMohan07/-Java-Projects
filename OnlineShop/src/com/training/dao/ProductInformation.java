package com.training.dao;
import java.util.*;
import java.sql.*;

import com.training.connect.DataConnect;
import com.training.pojo.Item;
import com.training.pojo.Product;
public class ProductInformation {
	//Map<Integer,Product> productmap;
	Connection con;
	PreparedStatement stat;
	List<Product> plist;
	Scanner sc;
	Product itm;
	double total = 0;
	double profit = 0;


	public ProductInformation() {
		con=DataConnect.getConnect();
		plist= new ArrayList<Product>();
		sc= new Scanner(System.in);
		itm = new Product();
	}
	public void insertdetails() throws SQLException {
		System.out.println("Enter the no of Products u want to have " );
		int noofitem=sc.nextInt();
		stat=con.prepareStatement("insert into Product values(?,?,?,?,?,?,?)");
		for(int x=0;x<noofitem;x++) {
			//Product i = new Product();
			System.out.println("Enter the product id");
			stat.setInt(1,sc.nextInt());
			System.out.println("Enter the product name");
			stat.setString(2,sc.next());
			System.out.println("Enter the buying price ");
			double d= sc.nextDouble();
			double sprice=d+(d*0.05);
			stat.setDouble(7,d);
			//System.out.println("Enter the sellingprice ");
			stat.setDouble(3,sprice);
			System.out.println("Enter the Available quantity");
			stat.setInt(4,sc.nextInt());
			System.out.println("Enter the itemname");
			stat.setString(5,sc.next());
			System.out.println("Enter the category");
			stat.setString(6,sc.next());
			
			int result = stat.executeUpdate();
			if(result>0) {
				System.out.println("products inserted");
			}
		}
		//itm.setProductmap(productmap);
		
	}
	
	  public void searchbyproductid() throws SQLException {
	  System.out.println("Enter the product id u want to search"); 
	  int prdctid=sc.nextInt();
	  
		/*
		 * boolean ans=productmap.entrySet().stream().allMatch(move->move.getValue().
		 * getProductid() ==(prdctid)); if(ans) {
		 * productmap.values().stream().forEach(n->{
		 * 
		 * System.out.println("The product name is"+ n.getProductname());
		 * System.out.println("The product price is  "+ n.getSellingprice());
		 * System.out.println("The product category is "+n.getCategory());
		 * 
		 * 
		 * });
		 */
	  stat=con.prepareStatement("select * from Product where productid = ?");
	  stat.setInt(1, prdctid);
	  ResultSet res = stat.executeQuery();
	  while(res.next()) {
		  System.out.println("The product name is "+res.getString(2));
		  System.out.println("The product price  is "+res.getDouble(3));
		  System.out.println("The product category is "+res.getString(6));


	  
	  
	  }
	  
	  
	  } public void listbycategory() throws SQLException {
	  System.out.println("Enter the category u want to search "); 
	  String cat=sc.next();
	  
		/*
		 * boolean
		 * ans=productmap.entrySet().stream().allMatch(move->move.getValue().getCategory
		 * ().equals(cat)); if(ans) { productmap.values().stream().forEach(n->{
		 * 
		 * System.out.println("The product id is "+ n.getProductid());
		 * System.out.println("The product name is"+ n.getProductname());
		 * System.out.println("The product price is  "+ n.getSellingprice());
		 * System.out.println("The product category is "+n.getCategory());
		 * 
		 * 
		 * }); }
		 */
	  stat=con.prepareStatement("select * from Product where category = ?");
	  stat.setString(1, cat);
	  ResultSet res = stat.executeQuery();
	  while(res.next()) {
		  System.out.println("The product id is "+res.getInt(1));

		  System.out.println("The product name is "+res.getString(2));
		  System.out.println("The product price  is "+res.getDouble(3));
		  System.out.println("The product category is "+res.getString(6));


	  }
	  
	  }
	  
	  
	  public void searchbyname() throws SQLException {
	  System.out.println("Enter the name of the product u want to search "); String
	  name= sc.next();
	  
		/*
		 * boolean ans=productmap.entrySet().stream().allMatch(move->move.getValue().
		 * getProductname().equals(name)); if(ans) {
		 * productmap.values().stream().forEach(n->{
		 * 
		 * System.out.println("The product id is "+ n.getProductid());
		 * System.out.println("The product name is"+ n.getProductname());
		 * System.out.println("The product price is  "+ n.getSellingprice());
		 * System.out.println("The product category is "+n.getCategory());
		 * 
		 * 
		 * });
		 */ 
	  stat=con.prepareStatement("select * from Product where productname = ?");
	  stat.setString(1, name);
	  ResultSet res = stat.executeQuery();
	  while(res.next()) {
		  System.out.println("The product id is "+res.getInt(1));
		  System.out.println("The product name is "+res.getString(2));
		  System.out.println("The product price  is "+res.getDouble(3));
		  System.out.println("The product category is "+res.getString(6));
	  }

	  }
	  
	   public void totalamount() throws SQLException {
	  System.out.println("Enter the category u want to search ");
	  String cat=
	  sc.next();
	  
	  
		/*
		 * boolean
		 * ans=productmap.entrySet().stream().allMatch(e->e.getValue().getCategory().
		 * equals(cat)); if(ans) { productmap.values().stream().forEach(e->{
		 * 
		 * total=total+e.getSellingprice(); });
		 */
	  stat=con.prepareStatement("select sellingprice from Product where category =?");
	  stat.setString(1, cat);
	  ResultSet res = stat.executeQuery();
	  while(res.next()) {
		  total= total+res.getDouble(1);
	  }
	  System.out.println("The total amount is "+total);
	  
	   }
	   public void profitamt() throws SQLException {
	  System.out.println("Enter the category u want to search "); String cat=
	  sc.next();
	  
	  
	  /*boolean
	  ans=productmap.entrySet().stream().allMatch(e->e.getValue().getCategory().
	  equals(cat)); if(ans) { productmap.values().stream().forEach(e->{
	  
	  profit=e.getSellingprice()-e.getBuyingprice(); });*/
	  
	  stat=con.prepareStatement("select sellingprice,buyingprice from Product where category =?");
	  stat.setString(1, cat);
	  ResultSet res = stat.executeQuery();
	  while(res.next()) {
		 profit=profit+(res.getDouble(1)-res.getDouble(2)) ;
	  
	  }
	  System.out.println("The profit amount is "+profit);
	  
	   }
	 
}
