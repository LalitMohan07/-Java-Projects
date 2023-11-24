package poduct.onetoone;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppMain {
	SessionFactory sesfact;
	Session session;
	Transaction tx;
	Scanner sc;
	public AppMain() {
		sesfact= new Configuration().configure("hiber.cfg.xml").buildSessionFactory();
		sc=new Scanner(System.in);
	}
	public void insertProduct() {
		session=sesfact.openSession();
		tx=session.beginTransaction();
		Product p = new Product();
		ProductDetail pod = new ProductDetail();
		p.setProductid(5);
		p.setProductname("Bat");
		p.setCategory("sports");
		pod.setManufacturername("SG");
		pod.setDateofexpire("none");
		pod.setDateofmanufacture("12/04/2023");
		pod.setProductobj(p);
		p.setPobj(pod);
		session.save(p);
		tx.commit();
		System.out.println("Data inserted");
	}
	public void retrieve() {
		
		session=sesfact.openSession();
		Query<Product> query = session.createQuery("select p from Product p join p.pobj");
		
		List<Product> plist=query.list();
		for( Product arr:plist ) {
			System.out.println("Poduct name is "+arr.getProductname());
			ProductDetail p =arr.getPobj(); 
			System.out.println("poduct Manufacturer name is "+p.getManufacturername());
		}
		
	}
	public void update() {
		session=sesfact.openSession();
		tx= session.beginTransaction();
		System.out.println("ENter the product id u want to update");
		int update=sc.nextInt();
		ProductDetail p= session.find(ProductDetail.class, update);
		if(p!=null) {
			System.out.println("Enter the new Manufacturer name");
			p.setManufacturername(sc.next());
			System.out.println("Data Updated");

			tx.commit();
		}
		else {
			System.out.println("No record found");
		}
	}
	public void delete() {
		session=sesfact.openSession();
		tx= session.beginTransaction();
		System.out.println("ENter the product id u want to delete");
		int delete=sc.nextInt();
		Product p= session.find(Product.class, delete);
		if(p!=null) {
			session.delete(p);
			System.out.println("Data deleted");
			tx.commit();
		}
		else {
			System.out.println("No record found");
		}
		/*
		 * Query q= session.createQuery("delete from Product where productid=:s");
		 * System.out.println("Enter the productid u want to delete");
		 * q.setParameter("s",sc.nextInt()); int a=q.executeUpdate();
		 * System.out.println("Data deleted"); System.out.println(a);
		 */
		
	}
	
public static void main(String[] args) {
	AppMain app = new AppMain();
	//app.insertProduct();
	//app.retrieve();
	//app.delete();
	app.update();
}
}
