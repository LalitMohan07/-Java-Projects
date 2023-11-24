package dao;

import java.sql.*;
import java.util.*;

import connect.DataConnect;
import dto.Customer;
import dto.Item;

public class Customerdao {
	private Connection con;
	private PreparedStatement stat;
	private Scanner sc;
	public Customerdao() {
		con=DataConnect.getConnect();
		sc= new Scanner(System.in);
	}
	public void storeCustomerDetails() throws SQLException {
		System.out.println("Enter the no of customer details u want to add");
		int noofcust=sc.nextInt();
		stat=con.prepareStatement("insert into CUSTOMER values(?,?,?,?)" );
		for(int i=1;i<=noofcust;i++) {
			System.out.println("Enter the customer code ");
			stat.setString(1,sc.next());
			System.out.println("Enter the customer name ");
			stat.setString(2, sc.next());
			System.out.println("Enter the customer phone number ");
			stat.setString(3, sc.next());
			System.out.println("Enter the customer Address ");
			stat.setString(4, sc.next());
			int result= stat.executeUpdate();
			if(result>0) {
				System.out.println("Customer details added");
			}
			
			
		}
	}
	
	public void customerDetails() throws SQLException {
		System.out.println("Enter the customer code to display the details of customer");
		String code = sc.next();
		stat=con.prepareStatement("select customer_name,address from CUSTOMER where customer_code=?");
		stat.setString(1,code );
		ResultSet result = stat.executeQuery();
		while(result.next()) {
			
			System.out.println("The Customer name is "+result.getString(1));
			System.out.println("The Customer Address is "+result.getString(2));

			
		}
		
	}
}
