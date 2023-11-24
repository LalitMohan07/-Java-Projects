package onetoone;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	SessionFactory sesfact;
	Session session;
	Transaction tx;
	public Main() {
		sesfact= new Configuration().configure("hiber.cfg.xml").buildSessionFactory();
	}
	public void insertData() {
		session=sesfact.openSession();
		tx=session.beginTransaction();
		Student std= new Student();
		Address add = new Address();
		std.setStudentid(3);
		std.setStudentname("mohit");
		std.setScore(80);
		add.setCity("kalkaji");
		add.setHouseno(48);
		add.setState("New Delhi");
		add.setStobj(std);
		std.setAddobj(add);
		session.save(std);
		tx.commit();
		System.out.println("Data saved");
	}
	public void display() {
		session=sesfact.openSession();
		tx=session.beginTransaction();
		Query query = session.createQuery("select s.studentname,a.houseno,a.city,a.state from Student s join Address a on (s.studentid=a.addid) ");
		List<Object[]> stdlist = query.list();
		for(Object[] arr:stdlist){
			System.out.println("The student name is "+arr[0]);
			System.out.println("The student house no is "+arr[1]);
			System.out.println("The student city is "+arr[2]);
			System.out.println("The student State is "+arr[3]);

		}
		
	}
	public static void main(String[] args) {
		Main m= new Main();
		//m.insertData();
		m.display();
	}
}
