package com.training.hibernate;


import java.util.Scanner;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class App {
	private SessionFactory sesfact;
	private Session session;
	private Transaction tx;
	Scanner sc;
	public App() {
		sesfact=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		sc= new Scanner(System.in);
	}
	public void insert() {
		session=sesfact.openSession();
		tx=session.beginTransaction();
		System.out.println("Enter the no of movies u want to insert ");
		int noofmovie=sc.nextInt();
		for(int x=1;x<=noofmovie;x++) {
			
		
		Movie m= new Movie();
		System.out.println("Enter the movie code");
		m.setMoviecode(sc.nextInt());
		System.out.println("Enter the movie name");
		m.setMovietitle(sc.next());
		System.out.println("Enter the movie duration");
		m.setDuration(sc.nextInt());
		System.out.println("Enter the price of the movie");
		m.setPrice(sc.nextDouble());
		session.save(m);
		System.out.println("Data Saved");
		}
		tx.commit();
	}
	public void delete() {
		session=sesfact.openSession();
		tx=session.beginTransaction();
		System.out.println("Enter the movie code u want to delete ");
		int deletecode=sc.nextInt();
		Movie mobj= session.find(Movie.class, deletecode);
		if(mobj!=null) {
			System.out.println("Find the data");
			session.delete(mobj);
			tx.commit();
		}
		else {
			System.out.println("No record found");
		}
	}
	public void update() {
		session=sesfact.openSession();
		tx=session.beginTransaction();
		System.out.println("Enter the movie code u want to update");
		int updatedata= sc.nextInt();
		Movie mobj=session.find(Movie.class, updatedata);
		if(mobj!=null) {
			System.out.println("Enter the new price");
			mobj.setPrice(sc.nextDouble());
			tx.commit();
		}
	}
	public static void main(String[] args) {
		App a= new App();
		//a.insert();
		//a.delete();
		a.update();
	}
}
