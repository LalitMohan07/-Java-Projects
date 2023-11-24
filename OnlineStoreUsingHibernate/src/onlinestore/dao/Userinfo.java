package onlinestore.dao;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import onlinestore.entity.Product;
import onlinestore.session.SessionFact;

public class Userinfo {
	private Scanner sc;
	Session session;
	SessionFactory ses;
	Transaction tx;
	List<Product> buyProduct;
	List<Product> pdata;
	
	
	public Userinfo() {
		sc= new Scanner(System.in);
		ses=SessionFact.getSession();
		 pdata=new LinkedList<>();
	
	}


	public void listbycategory() {
		session=ses.openSession();
		Query q= session.createQuery("from Product" );
		List<Product> ulist = q.list();
		for(Product p:ulist) {
			System.out.println("The Product id is "+p.getProductid());
			System.out.println("The product name is "+p.getProductname());
			System.out.println("The Product price is  "+p.getSellingprice());
			System.out.println("The available quantity is "+p.getAvailableQuantity());
		}
	}
	public void categoryAndPrice() {
		 System.out.println("Select filter option:");
	        System.out.println("1. Filter by price");
	        System.out.println("2. Filter by category");

	        int choice = sc.nextInt();
	        switch(choice) {
	        case 1:
	    		session=ses.openSession();
	    		Query q= session.createQuery("select p from Product p order by p.sellingprice asc" );
	    		List<Product> ulist = q.list();
	    		for(Product p:ulist) {
	    			System.out.println(p.getProductname()+"-"+p.getSellingprice());
	    		}
	    		break;
	        case 2:
	        	session=ses.openSession();
	    		Query q1= session.createQuery("select p from Product p order by p.category asc" );
	    		List<Product> uselist = q1.list();
	    		for(Product p:uselist) {
	    			System.out.println(p.getProductname()+"-"+p.getSellingprice()+"-"+p.getCategory());
	    		}
	    		break;

	        }

	}
	public void UserCart() {
		session=ses.openSession();
		String ch="y";
		while(ch.equals("y")) {
			
			listbycategory();
			System.out.println("Enter the product name u want to buy ");
			String pname=sc.next();
			Query q= session.createQuery("select p from Product p where p.productname=:n");
			q.setParameter("n", pname);
			//List<Product> pdata=new LinkedList<>();
			buyProduct= q.list();
			for(Product pd:buyProduct){
				pd.getProductname();
				pd.getSellingprice();
				pdata.add(pd);
				//System.out.println("The Product is added to the Cart");
				
				
			}	
			System.out.println("Would u like to buy some more  Product");
			ch=sc.next();
					
			}
		System.out.println("The final bill is ");
		bill();
				
			}
			
		
		
	


	public void bill() {
		session=ses.openSession();
		double totalamount =0;
		for(Product p:pdata) {
			totalamount+=p.getSellingprice();
		}
		System.out.println("The Total bill amount is "+totalamount);
	}
}
