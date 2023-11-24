package myshopee;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.*;
public class App {
	SessionFactory sesfact;
	Session session;
	Transaction tx;
	Scanner sc;
	public App() {
		sesfact=new Configuration().configure("hiber.cfg.xml").buildSessionFactory();
		sc= new Scanner(System.in);
	}
	public void insertdata() {
		session=sesfact.openSession();
		tx=session.beginTransaction();
		/*Customer cust = new Customer();
		cust.setCustomercode(11);
		cust.setCustomername("Mic");
		cust.setPhonenumber("741522");
		cust.setAddress("Mumbai");
		Item itm= new Item();
		itm.setItemcode(101);
		itm.setItemname("Bat");
		itm.setItemprice(2000);
		itm.setQoh(4);
		itm.setCustobj(cust);
		Item itm1= new Item();
		itm1.setItemcode(102);
		itm1.setItemname("Ball");
		itm1.setItemprice(500);
		itm1.setQoh(10);
		itm1.setCustobj(cust);
		Set<Item> itmlist = new HashSet<Item>();
		itmlist.add(itm);
		itmlist.add(itm1);
		cust.setItemset(itmlist);
		session.save(cust);
		tx.commit();*/
		Customer cust = new Customer();
		for(int x=1;x<=1;x++)
		System.out.println("Enter the customer code");
		cust.setCustomercode(sc.nextInt());
		System.out.println("Enter the customer name ");
		cust.setCustomername(sc.next());
		System.out.println("Enter the address");
		cust.setAddress(sc.next());
		System.out.println("Enter the phone number");
		cust.setPhonenumber(sc.next());
		System.out.println("ENter the no of items u want to have");
		int noofitem=sc.nextInt();
		for(int i=1;i<=noofitem;i++) {
			Item itm= new Item();
			System.out.println("Enter the item id ");
			itm.setItemcode(sc.nextInt());
			System.out.println("Enter the item name");
			itm.setItemname(sc.next());
			System.out.println("Enter the item price ");
			itm.setItemprice(sc.nextDouble());
			System.out.println("Enter the quantity on hand ");
			itm.setQoh(sc.nextInt());
			itm.setCustobj(cust);
			Set<Item> itmlist = new HashSet<Item>();
			itmlist.add(itm);
			cust.setItemset(itmlist);
		}
		session.save(cust);
		tx.commit();

				
	}
	public void displayCustomer() {
		session=sesfact.openSession();
		System.out.println("Enter the customer id u want to display");
		int id=sc.nextInt();
		Query q=session.createQuery("from Customer where Customercode=:c");
		q.setParameter("c", id);
		List<Customer>custlist =q.list();
		for(Customer c:custlist) {
			System.out.println("The Customer name is "+c.getCustomername());
			System.out.println("The Customer Address is "+c.getAddress());

		}
	}
	public void displayItem() {
		session=sesfact.openSession();
		System.out.println("Enter the item id u want to display");
		int id=sc.nextInt();
		Item i=session.find(Item.class, id);
		if(i!=null) {
			System.out.println("the item name is "+i.getItemname());
			System.out.println("the item price is "+i.getItemprice());
		}
		
		
		
	}
	public static void main(String[] args) {
		App a = new App();
		//a.insertdata();
		a.displayCustomer();
		//a.displayItem();
	}
}
