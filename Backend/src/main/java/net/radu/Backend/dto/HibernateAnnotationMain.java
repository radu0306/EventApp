package net.radu.Backend.dto;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import net.radu.Backend.config.HibernateUtil;
import net.radu.Backend.Employee1;
import net.radu.Backend.dto.Event;

public class HibernateAnnotationMain {

	public static void main(String[] args) {
		Event event = new Event();
		event.setEventId(4);
		event.setuId(1);
		event.setDescription("eveniment 1");
		event.setName("test1");
		event.setTag("Natural_Disaster");
		event.setDate(new Date());
		
		Employee1 emp = new Employee1();
		emp.setId(3);
		emp.setName("Lisa");
		emp.setRole("Manager");
		emp.setInsertTime(new Date());
		
		//Get Session
		SessionFactory sessionFactory = HibernateUtil.getSessionAnnotationFactory();
		Session session = sessionFactory.getCurrentSession();
		//start transaction
		session.beginTransaction();
		//Save the Model object
//		session.save(event);
//		//Commit transaction
//		session.getTransaction().commit();
//		System.out.println("Employee ID="+event.getEventId());
		
String selectEvent = "FROM Event";
		
		Query query = sessionFactory.getCurrentSession().createQuery(selectEvent);

		

		 List<Event> events = query.list();
		 System.out.println(events);
		
		//terminate session factory, otherwise program won't end
		sessionFactory.close();
	}

}
