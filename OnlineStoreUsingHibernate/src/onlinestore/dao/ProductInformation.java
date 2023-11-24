package onlinestore.dao;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import onlinestore.entity.Item;
import onlinestore.entity.Product;
import onlinestore.entity.User;
import onlinestore.session.SessionFact;

public class ProductInformation {
	private Scanner sc;
	Session session;
	SessionFactory ses;
	Transaction tx;
	public ProductInformation() {
		sc= new Scanner(System.in);
		ses=SessionFact.getSession();
	}
	
	public void insertProduct(User u) {
		Set<Product> plist = new HashSet<Product>();
		session=ses.openSession();
		tx=session.beginTransaction();
		System.out.println("Enter the no of products u want to have ");
		int noofitem=sc.nextInt();
		for(int x=1;x<=noofitem;x++) {
			Product p = new Product();
			System.out.println("Enter the Item id ");
			p.setItemid(sc.nextInt());
			System.out.println("Enter the item name ");
			p.setItemname(sc.next());
			System.out.println("Enter the category ");
			p.setCategory(sc.next());
			System.out.println("Enter the buying price");
			p.setBuyingprice(sc.nextDouble());
			System.out.println("Enter the Product id ");
			p.setProductid(sc.nextInt());
			System.out.println("Enter the Product name ");
			p.setProductname(sc.next());
			double d=p.getBuyingprice();
			double sprice=d+(d*0.05);
			p.setSellingprice(sprice);
			System.out.println("Enter the Available Quantity");
			p.setAvailableQuantity(sc.nextInt());
			plist.add(p);
			u.setSetprod(plist);
			p.setUserobj(u);
			session.save(p);
		}
		tx.commit();
		
	}
	 public void searchbyproductid()  {
			session=ses.openSession();
			System.out.println("Enter the product id u want to search"); 
			int prdctid=sc.nextInt();
			Query q = session.createQuery("select e from Product e where e.productid=:p");
			q.setParameter("p", prdctid);
			List<Product> plist =q.list();
			for(Product pd :plist) {
				System.out.println("The product name is "+pd.getProductname());
				System.out.println("The selling pice is "+pd.getSellingprice());
			}
			}

	public void listbycategory() {
		session=ses.openSession();
		System.out.println("Enter the category u want to search"); 
		String st =sc.next();
		Query q=session.createQuery("select e from Product e where e.category=:c");
		q.setParameter("c", st);
		List<Product> plist =q.list();
		for(Product pd :plist) {
			System.out.println("The product name is "+pd.getProductname());
			System.out.println("The selling pice is "+pd.getSellingprice());
		}

		
	}

	public void searchbyname() {
		session=ses.openSession();
		System.out.println("Enter the product name u want to search"); 
		String st =sc.next();
		Query q=session.createQuery("select e from Product e where e.productname=:c");
		q.setParameter("c", st);
		List<Product> plist =q.list();
		for(Product pd :plist) {
			System.out.println("The product category is "+pd.getCategory());
			System.out.println("The product selling pice is "+pd.getSellingprice());
		}

	}

	public void totalamount() {
		session=ses.openSession();
		System.out.println("Enter the category u want to search"); 
		String st =sc.next();
		Query q=session.createQuery("select e from Product e where e.category=:c");
		q.setParameter("c", st);
		List<Product> plist =q.list();
		double totalamount=0;
		for(Product p:plist) {
			totalamount= totalamount+p.getSellingprice();
		}
		System.out.println("The Total Amount in this Category is "+totalamount);
	}

	public void profitamt() {
		session=ses.openSession();
		System.out.println("Enter the category u want to calculate profit"); 
		String st =sc.next();
		Query q=session.createQuery("select e from Product e where e.category=:c");
		q.setParameter("c", st);
		List<Product> plist =q.list();
		double profit=0;
		for(Product p:plist) {
			profit+= p.getSellingprice()-p.getBuyingprice();
		}
		System.out.println("The Total Amount in this Category is "+profit);
	}
		
	

}
