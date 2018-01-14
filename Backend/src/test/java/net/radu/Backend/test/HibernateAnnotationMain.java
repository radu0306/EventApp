package net.radu.Backend.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import net.radu.Backend.config.HibernateUtil;
import net.radu.Backend.dto.Event;

public class HibernateAnnotationMain {

	public static void main(String[] args) {
		Event event = new Event();
		event.setEventId(1);
		event.setuId(1);
		event.setDescription("eveniment 1");
		event.setName("test1");
		event.setTag("Natural_Disaster");
		
		//Get Session
		SessionFactory sessionFactory = HibernateUtil.getSessionAnnotationFactory();
		Session session = sessionFactory.getCurrentSession();
		//start transaction
		session.beginTransaction();
		//Save the Model object
		session.save(event);
		//Commit transaction
		session.getTransaction().commit();
		System.out.println("Employee ID="+event.getEventId());
		
		//terminate session factory, otherwise program won't end
		sessionFactory.close();
	}

}
