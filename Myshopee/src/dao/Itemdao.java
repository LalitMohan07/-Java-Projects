package dao;
import java.sql.*;
import java.util.*;
import connect.DataConnect;
import dto.Item;
public class Itemdao {
	private Connection con;
	private PreparedStatement stat;
	private Scanner sc;
	public Itemdao() {
		con=DataConnect.getConnect();
		sc= new Scanner(System.in);
	}
	public void storeItemDetails() throws SQLException {
		System.out.println("Enter the no of Item u want to add");
		int noofitem=sc.nextInt();
		
		stat = con.prepareStatement("insert into ITEM values(?,?,?,?)");
		for(int i=1;i<=noofitem;i++) {
			System.out.println("Enter the Item code ");
			stat.setString(1, sc.next());
			System.out.println("Enter the Item Nmae ");
			stat.setString(2, sc.next());
			System.out.println("Enter the Item price ");
			stat.setDouble(3, sc.nextDouble());
			System.out.println("Enter the quantity on hand ");
			stat.setInt(4, sc.nextInt());
			int result =stat.executeUpdate();
			if(result>0) {
				System.out.println("Items inserted");
			}
		}
		
	}
	public void ItemDetails() throws SQLException {

		stat=con.prepareStatement("select * from ITEM");
	
		ResultSet result = stat.executeQuery();
		while(result.next()) {
			
			System.out.println("The Item code is "+result.getString(1));
			System.out.println("The Item name is "+result.getString(2));
			System.out.println("The Item price is "+result.getDouble(3));

			
		}
		
	}
	
}
