package net.radu.Backend.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import net.radu.Backend.config.HibernateUtil;
import net.radu.Backend.dto.Event;

public class EventInsertionTest {

	public static void main(String[] args) {
		List<Event> events = new ArrayList<>();

		Event event = new Event();

		// Data set to test database conectivity
		event.setEventId(1);
		 event.setUserFirstName("Alexandru");
		 event.setUserLastName("Vintila");
		 event.setEmail("alexandru.v@gmail.com");
		 event.setDescription("A group of armed men are holding hostages in gara de nord");
		 event.setEventName("Hostage situation");
		 event.setTag("Terrorist_Act");
		 event.setCountry("Romania");
		 event.setCity("Bucharest");
		 event.setAllertCode(3);
		 event.setDate(new Date(2018, 1, 10, 13, 01));
//		 events.add(event);
		//
//		 event = new Event();
//		// event.setEventId(2);
//		 event.setUserFirstName("Radu");
//		 event.setUserLastName("Negoita");
//		 event.setEmail("negolas@gmail.com");
//		 event.setDescription("Avalanche that destroyed 2 houses in Paltinis");
//		 event.setEventName("Avalanche");
//		 event.setTag("Natural_Disaster");
//		 event.setCountry("Romania");
//		 event.setCity("Paltinis");
//		 event.setAllertCode(2);
//		 event.setDate(new Date(2017, 12, 29, 17, 00));
//		 events.add(event);
		//
//		 event = new Event();
//		 event.setEventId(3);
//		 event.setUserFirstName("Ivan");
//		 event.setUserLastName("Molotv");
//		 event.setEmail("ivan@gmail.com");
//		 event.setDescription("Earthquake that collapsed a few buildings in Volgograd");
//		 event.setEventName("Earthquacke");
//		 event.setTag("Natural_Disaster");
//		 event.setCountry("Russia");
//		 event.setCity("Volgograd");
//		 event.setAllertCode(3);
//		 event.setDate(new Date(2016, 04, 30, 06, 48));
//		 events.add(event);
		//
//		 event = new Event();
//		 event.setEventId(4);
//		 event.setUserFirstName("Matei");
//		 event.setUserLastName("Panaitescu");
//		 event.setEmail("matei@gmail.com");
//		 event.setDescription("accident involvin huge number of cars on A1");
//		 event.setEventName("Accident");
//		 event.setTag("Accident");
//		 event.setCountry("Romania");
//		 event.setCity("Near Pitesti");
//		 event.setAllertCode(1);
//		 event.setDate(new Date(2016, 06, 3, 10, 27));
		// events.add(event);

		//

		SessionFactory sessionFactory = HibernateUtil.getSessionAnnotationFactory();
		Session session = sessionFactory.getCurrentSession();
		// Table insertion
		// Get Session
		// start transaction
		 session.beginTransaction();
		// Save the Model object
		 session.save(event);
		// //Commit transaction
		 session.getTransaction().commit();
		 System.out.println("Event ID="+event.getEventId());

		// Table extraction

		// start transaction
//		session.beginTransaction();
//		String selectEvent = "FROM Event";//
//		Query query = sessionFactory.getCurrentSession().createQuery(selectEvent);
//		events = query.list();
//		System.out.println("Rezultat extragere= " + events);

		sessionFactory.close();
	}

}
