package onetomany;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
		sesfact=new Configuration().configure("hiber.cfg.xml").buildSessionFactory();
	}
	public void insertdata() {
		session=sesfact.openSession();
		tx=session.beginTransaction();
		Department dept = new Department();
		dept.setDeptcode(102);
		dept.setDeptname("Sports");
		dept.setCity("Mumbai");
		/*Employee emp = new Employee();
		emp.setEmpid(1);
		emp.setEmpname("Mohan");
		emp.setSalary(10000);
		emp.setDeptobj(dept);*/
		
		Employee emp1 = new Employee();
		emp1.setEmpid(3);
		emp1.setEmpname("Mukesh");
		emp1.setSalary(80000);
		emp1.setDeptobj(dept);
		Set<Employee> emplist =new HashSet<Employee>();
		//emplist.add(emp);
		emplist.add(emp1);
		dept.setEmplist(emplist);
		session.save(dept);
		tx.commit();
	}
	public void display() {
		session=sesfact.openSession();
		Query<Employee> q= session.createQuery("select d from Employee d join d.deptobj");
		//Query q= session.createQuery("select d.Departmentcode,d.Departmentname,e.Employeename,e.Salary from Department d join Employee e on (d.deptcode=e.deptcode)");

		List<Employee> deptlist = q.list();
		for(Employee d:deptlist) {
			Department dep =d.getDeptobj();
			System.out.println("The Dept code is "+dep.getDeptcode());
			System.out.println("The Dept name is "+dep.getDeptname());

			System.out.println("The Employee name is "+d.getEmpname());
			System.out.println("The Employee salary is "+d.getSalary());


		}
		
		

	}
	public static void main(String[] args) {
		Main mn= new Main();
		//mn.insertdata();
		mn.display();
	}
	
}
