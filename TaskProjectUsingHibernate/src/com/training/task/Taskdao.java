package com.training.task;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Taskdao {
	private Session session;
	private SessionFactory sesfact;
	private Transaction tx;
	private Scanner sc;
	public Taskdao() {
		sesfact= new Configuration().configure("hiber.cfg.xml").buildSessionFactory();
		sc= new Scanner(System.in);
	}
	public void insert() {
		session=sesfact.openSession();
		tx=session.beginTransaction();
		System.out.println("Enter the no of task  u want to assign");
		int nooftask=sc.nextInt();
		for(int x=1;x<=nooftask;x++) {
			Task task= new Task();
			System.out.println("Enter the task id ");
			task.setTask_id(sc.nextInt());
			System.out.println("Enter the task Name");
			task.setTask_title(sc.next());
			System.out.println("Enter the task text");
			task.setTask_text(sc.next());
			System.out.println("Enter the name of the person to whom thw task is assigned");
			task.setAssigned_to(sc.next());
			session.save(task);
		}
		tx.commit();
	}
	public void view(){
		session=sesfact.openSession();
		tx=session.beginTransaction();
		Query query=session.createQuery("from Task");
		List<Task> tlist =query.list();
		for(Task t:tlist) {
			System.out.println("The task name is "+t.getTask_title());
			System.out.println("The task is assigned to "+t.getAssigned_to());
		}
	}
	
	public void delete() {
		session=sesfact.openSession();
		tx=session.beginTransaction();
		System.out.println("Enter the Task id u want to delete ");
		int id=sc.nextInt();
		Task tobj = session.find(Task.class, id);
		if(tobj!=null) {
			System.out.println("The task was deleted");
			session.delete(tobj);
			tx.commit();
		}
		else {
			System.out.println("id not found");
		}
	}
	public void update() {
		session=sesfact.openSession();
		tx=session.beginTransaction();
		System.out.println("Enter the Task id u want to update ");
		int id=sc.nextInt();
		Task tobj = session.find(Task.class, id);
		if(tobj!=null) {
			System.out.println("Enter the new person to whom the task is assigned");
			tobj.setAssigned_to(sc.next());
			System.out.println("Data was updated");
			tx.commit();
		}
		else {
			System.out.println("id not found");
		}
	}
	
}
