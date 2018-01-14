package net.radu.Backend.daoimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.radu.Backend.config.HibernateUtil;
import net.radu.Backend.dao.EventDAO;
import net.radu.Backend.dto.Event;


@Repository("eventDAO")
public class EventDAOImpl implements EventDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private static List<Event> events = new ArrayList<>();

	
	  static { Event event = new Event(); event.setEventId(1); event.setuId(1);
	  event.setDescription("eveniment 1"); event.setName("test1");
	  event.setTag("Natural_Disaster"); event.setDate(new Date(2017, 12, 12,
	  13, 01)); events.add(event);
	  
	  event = new Event(); event.setEventId(2); event.setuId(2);
	  event.setDescription("eveniment 2"); event.setName("test2");
	  event.setTag("Natural_Disaster"); event.setDate(new Date(2017, 12, 12,
	  13, 02)); events.add(event);
	  
	  event = new Event(); event.setEventId(3); event.setuId(3);
	  event.setDescription("eveniment 3"); event.setName("test3");
	  event.setTag("Terrorist_Act"); event.setDate(new Date(2017, 12, 12, 13,
	  03)); events.add(event);
	  
	  event = new Event(); event.setEventId(4); event.setuId(4);
	 event.setDescription("eveniment4 "); event.setName("test4");
	  event.setTag("Accident"); event.setDate(new Date(2017, 12, 12, 13, 04));
	  events.add(event); }
	 

	@Override
	public List<Event> list() {

//		SessionFactory sessionFactory = HibernateUtil.getSessionAnnotationFactory();
//		Session session = sessionFactory.getCurrentSession();
//		
//		// start transaction
//		session.beginTransaction();
//
//		String selectEvent = "FROM Event";
//
//		Query query = sessionFactory.getCurrentSession().createQuery(selectEvent);
//
//		List<Event> events = query.list();
//		System.out.println(events);
//
//		// terminate session factory, otherwise program won't end
//		sessionFactory.close();
		return events;

	}

	@Override
	public Event get(int id) {
		for (Event event : events) {
			if (event.getEventId() == id)
				return event;
		}

		return null;
	}

	// add an event to the Even table
	@Override
	@Transactional
	public boolean add(Event event) {
		try {
			// Configuration con = new Configuration();
			// con.configure("hibernate.cfg.xml");
			// SessionFactory sessionF = con.buildSessionFactory();
			// Session session = sessionF.openSession();
			// Transaction tr = session.beginTransaction();
			// session.save(event);
			// tr.commit();
			// session.close();
			// sessionF.close();
			sessionFactory.getCurrentSession().persist(event);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}

	}

}
