package service;

import java.sql.SQLException;
import java.util.Scanner;

import dao.ConcessionMyShop;
import dao.Customerdao;
import dao.Itemdao;
import dao.Purchasedao;

public class MystoreService {
	private Scanner sc;
	Itemdao idao;
	Customerdao cdao;
	Purchasedao pdao;
	ConcessionMyShop cons;
	public MystoreService() {
		sc= new Scanner(System.in);
		idao= new Itemdao();
		cdao= new Customerdao();
		pdao= new Purchasedao();
		cons= new ConcessionMyShop();
		
	}
	public void insertitem() throws SQLException {
		idao.storeItemDetails();
	}
	public void showItemDetails() throws SQLException {
		idao.ItemDetails();

	}
	public void insertCustomerDetails() throws SQLException {
		cdao.storeCustomerDetails();
	}
	public void showCustomerDetails() throws SQLException {
		cdao.customerDetails();

	}
	public void insertPurchaseDetails() throws SQLException {
		pdao.purchaseDetails();
	}
	public void showPurchaseDetails() throws SQLException {
		pdao.displaypurchaseDetails();

	}
	public void showConcessionPrice() throws SQLException {
		System.out.println("Enter the item code for which u want to calculate the concession ");
		String noofitem=sc.next();
		cons.calculateConcession(noofitem);
	}
}
