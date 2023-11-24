package dao;
import java.util.*;

import connect.DataConnect;

import java.sql.*;
public class Purchasedao {
	private Connection con;
	private PreparedStatement stat;
	private Scanner sc;
	public Purchasedao() {
		con=DataConnect.getConnect();
		sc= new Scanner(System.in);
	}
	public void purchaseDetails() throws SQLException {
		System.out.println("Enter the no of purchase details u want to add");
		int noofpur=sc.nextInt();
		stat=con.prepareStatement("insert into PURCHASE values(?,?,?,?,?)" );
		for(int i=1;i<=noofpur;i++) {
			System.out.println("Enter the Transaction id ");
			stat.setString(1,sc.next());
			
			System.out.println("Enter the Item code ");
			stat.setString(2, sc.next());
			System.out.println("Enter the date of purchase ");
			stat.setString(3, sc.next());
			System.out.println("Enter the Quantity purchased ");
			stat.setInt(4, sc.nextInt());
			System.out.println("Enter the customer code ");
			stat.setString(5, sc.next());
			
			int result= stat.executeUpdate();
			if(result>0) {
				System.out.println("Purchase details added");
			}
			
			
		}
	}
	public void displaypurchaseDetails() throws SQLException {
		System.out.println("Enter the customer code to display the details of customer");
		String code = sc.next();
		stat=con.prepareStatement("select c.customer_name,i.item_name,p.quantity_pur from CUSTOMER c,ITEM i,PURCHASE p where c.customer_code=? AND c.customer_code = p.customer_code AND i.item_code=p.item_code ");
		stat.setString(1,code );
		ResultSet result = stat.executeQuery();
		while(result.next()) {
			
			System.out.println("The Customer name is "+result.getString(1));
			System.out.println("The Item name is "+result.getString(2));
			System.out.println("The Quantity purchased is "+result.getInt(3));

			
		}
		
	}
}
