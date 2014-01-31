package org.sakila;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("root-context.xml");
		SessionFactory factory = ctx.getBean(SessionFactory.class);
		Session session = factory.openSession();
		Transaction tx= session.beginTransaction();
		for(int i=110;i<1000;i++){
			Test test = new Test();
			test.setIdtest(i);
			test.setTestcol1("test2");
			session.save(test);			
		}
		session.getTransaction().commit();
	}

}
