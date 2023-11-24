package com.training.dao;

import java.util.*;
import java.util.stream.Collectors;

import com.training.pojo.User;
import com.training.connect.DataConnect;
import com.training.pojo.Product;
import java.sql.*;
public class UserInformation {
	Map<Integer,Product> productmap;
	List<Product> productlist;
	Scanner sc;
	Connection con;
	Statement stat;
	PreparedStatement stm;
	public UserInformation() {
		productmap= new HashMap<Integer,Product>();
		productlist = new LinkedList<Product>();
		sc= new Scanner(System.in);
		con=DataConnect.getConnect();
		

	}
	public void displayproducts() {
		System.out.println("ENter the category ");
		String cat= sc.next();
		boolean ans=productmap.entrySet().stream().allMatch(e->e.getValue().getCategory().equals(cat));
		if(ans) {
			productmap.values().stream().forEach(n->{
				System.out.println("The product id is"+n.getProductid());
				System.out.println("The product name is"+n.getProductname());
				System.out.println("The product price is"+n.getSellingprice());
				System.out.println("The product category is"+n.getCategory());

			});
		}
		
		}
	public void categoryandprice() throws SQLException {

        System.out.println("Select filter option:");
        System.out.println("1. Filter by price");
        System.out.println("2. Filter by category");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
               stat=con.createStatement();
               ResultSet res = stat.executeQuery("select * from Product order by sellingprice asc");
               while(res.next()) {
            	   System.out.println(res.getString(2)+"-"+res.getDouble(3));
               }
               
                break;
				

            case 2:
            	 stat=con.createStatement();
                 ResultSet res1 = stat.executeQuery("select * from Product order by category asc");
                 while(res1.next()) {
              	   System.out.println(res1.getString(6)+"----------" 
              			   +res1.getString(2)+"-"+res1.getDouble(3));
                 }
                 break;
                 
            default:
                System.out.println("Invalid choice");
        }
		}
	
	public List<Product> UserCart() throws SQLException {
		System.out.println("Enter no of products u want to buy");
		int noofproduct=sc.nextInt();
		for(int x=1;x<=noofproduct;x++) {
			
			Product p = new Product();
			System.out.println("Enter the product id to buy the product ");
			int id=sc.nextInt();
			stm=con.prepareStatement("select * from Product where productid=?");
			stm.setInt(1, id);
			ResultSet res= stm.executeQuery();
			while(res.next()){
				p.setProductname(res.getString(2));
				p.setSellingprice(res.getDouble(3));
				
				
				productlist.add(p);
				System.out.println("Products added to the cart ");
		}
		}
		return productlist;
		
		}
		
		
	
	public  void bill() throws SQLException {
		UserInformation u = new UserInformation();
		List<Product> plist = u.UserCart();
		double totalPrice=0;
		for(Product p1:plist) {
			
				System.out.println("The product name is " +p1.getProductname());
				totalPrice+=p1.getSellingprice();
		
		
			
	}
		System.out.println("The total bill is "+ totalPrice);
	}
}
	

