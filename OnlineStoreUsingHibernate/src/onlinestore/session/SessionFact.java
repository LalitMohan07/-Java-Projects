package onlinestore.session;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class SessionFact {
	static SessionFactory sesfact;
	Session session;
	Transaction tx;
	private SessionFact() {
		sesfact= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}
	public static SessionFactory getSession() {
		SessionFact ses = new SessionFact();
		return sesfact;
		
	}
	
}
