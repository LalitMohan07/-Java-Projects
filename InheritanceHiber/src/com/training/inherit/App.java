package com.training.inherit;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App {
	private SessionFactory sesfact;
	private Session session;
	private Transaction tx;
	public App() {
		sesfact=new Configuration().configure("hiber.cfg.xml").buildSessionFactory();
	}
	
	
	//using table per hierarchy
	/*
	 * public void insertdata() { session=sesfact.openSession();
	 * tx=session.beginTransaction(); permanentEmployee emp = new
	 * permanentEmployee(); emp.setEmpid(2); emp.setEmpname("Mohan");
	 * emp.setSalary(20000); emp.setBonus(5000); session.save(emp); tx.commit(); }
	 */
	public void insertdata() {
		session=sesfact.openSession();
		tx=session.beginTransaction();
		TempEmployee emp = new TempEmployee();
		emp.setEmpid(3);
		emp.setEmpname("Mohit");
		emp.setContAmount(50000);
		emp.setDuration(90);
		
		session.save(emp);
		tx.commit();
	}
	public void display() {
		session=sesfact.openSession();
		tx=session.beginTransaction();
		Query query=session.createQuery("from permanentEmployee");
		List<permanentEmployee> elist =query.list();
		for(permanentEmployee emp:elist) {
			System.out.println("The empid is "+emp.getEmpid());
			System.out.println("The empname is "+emp.getEmpname());
			System.out.println("The employee salary is "+emp.getSalary());
			System.out.println("The employee Bonus is "+emp.getBonus());


		}
		
	}
	
	//using table per subclass
	public void insertPermanentEmployee() {
		session=sesfact.openSession();
		tx=session.beginTransaction();
		permanentEmployee pemp= new permanentEmployee();
		pemp.setEmpid(4);
		pemp.setEmpname("Mahi");
		pemp.setSalary(40000);
		pemp.setBonus(10000);
		session.save(pemp);
		tx.commit();
	}
	public void retrieve() {
		Session ses=sesfact.openSession();
		Query query =ses.createQuery("from permanentEmployee p where p.empid=:eid");
		query.setParameter("eid",1);
		List<permanentEmployee> plist=query.list();
		for(permanentEmployee pemp:plist) {
			System.out.println("EMployee name is "+pemp.getEmpname());
			System.out.println("Salary is "+pemp.getSalary());
		}
	}
	
	
	//using table per concrete class
	public void insertTempEmployee() {
		session=sesfact.openSession();
		tx=session.beginTransaction();
		TempEmployee temp = new TempEmployee();
		temp.setEmpid(2);
		temp.setEmpname("mike");
		temp.setContAmount(40000);
		temp.setDuration(60);
		session.save(temp);
		tx.commit();
	}
	
	public static void main(String[] args) {
		App a = new App();
		//a.insertdata();
		//a.display();
		//a.insertPermanentEmployee();
		//a.retrieve();
		a.insertTempEmployee();
	}
}
