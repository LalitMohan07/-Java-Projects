package com.training.dao;
import java.util.*;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.training.pojo.Book;
public class Bookdao {
	private SessionFactory sesfact;
	private Session session;
	private Transaction tx;
	Scanner sc;
	private List<Book> booklist;
	private List<Object[]> datalist;
	public Bookdao() {
		sesfact=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		sc= new Scanner(System.in);
		booklist= new ArrayList<Book>();

	}
	public void insert() {
		session=sesfact.openSession();
		tx=session.beginTransaction();
		System.out.println("Enter the no of books u want to insert ");
		int noofbook=sc.nextInt();
		for(int x=1;x<=noofbook;x++) {
			Book b= new Book();
			System.out.println("Enter the book id ");
			b.setBookid(sc.nextInt());
			System.out.println("Enter the book name ");
			b.setBookname(sc.next());
			System.out.println("Enter the book price ");
			b.setPrice(sc.nextDouble());
			System.out.println("Enter the book's writer name ");
			b.setWritername(sc.next());
			session.save(b);
			System.out.println("Data saved");
			
		}
		tx.commit();
	}
	public void delete() {
		session=sesfact.openSession();
		tx=session.beginTransaction();
		System.out.println("Enter the book id u want to delete ");
		int deletecode=sc.nextInt();
		Book bobj= session.find(Book.class, deletecode);
		if(bobj!=null) {
			System.out.println("Find the data");
			session.delete(bobj);
			tx.commit();
		}
		else {
			System.out.println("No record found");
		}
	}
	public void update() {
		session=sesfact.openSession();
		tx=session.beginTransaction();
		System.out.println("Enter the Book id u want to update");
		int updatedata= sc.nextInt();
		Book bobj=session.find(Book.class, updatedata);
		if(bobj!=null) {
			System.out.println("Enter the new price");
			bobj.setPrice(sc.nextDouble());
			tx.commit();
		}
	}
	public void view() {
		session = sesfact.openSession();
		Query query = session.createQuery("from Book");
		booklist=query.list();
		for(Book b:booklist) {
			System.out.println("The Book Name is "+b.getBookname());
			System.out.println("The Book price is "+b.getPrice());

		}
		Query query1= session.createQuery("select b.bookname,b.price from Book b");
		List<Object[]> datalist = query1.list();
		for(Object[] arr:datalist) {
			System.out.println("The Book Name is "+arr[0]);
			System.out.println("The Book price is "+arr[1]);

		}
	}
	
}
