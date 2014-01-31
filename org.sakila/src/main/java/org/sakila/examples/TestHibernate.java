package org.sakila.examples;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHibernate {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("root-context.xml");
		SessionFactory sessionFactory = ctx.getBean(SessionFactory.class);
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		UserDetails user = new UserDetails();
		user.setUserName("safeer");
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("car");
		user.setVehicle(vehicle);
		
		session.save(user);
		session.save(vehicle);
		//session.save(userDetails2);
		session.getTransaction().commit();
		session.close();
		
	}

}
