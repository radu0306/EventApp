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
import net.radu.Backend.dto.User;

@Repository("eventDAO")
public class EventDAOImpl implements EventDAO {

	@Autowired
	SessionFactory sessionFactory = HibernateUtil.getSessionAnnotationFactory();

	private static List<Event> events = new ArrayList<>();


	
	// geting all events from database
	@Override
	public List<Event> list() {

		Session session = sessionFactory.getCurrentSession();

		// start transaction
		session.beginTransaction();

		String selectEvent = "FROM Event";

		Query query = sessionFactory.getCurrentSession().createQuery(selectEvent);

		events = query.list();
		System.out.println(events);

		sessionFactory.close();
		return events;

	}

	// geting a single event
	@Override
	public Event get(int id) {
		Session session = sessionFactory.getCurrentSession();
		// start transaction
		session.beginTransaction();

		Event event = new Event();
		event = (Event) session.get(Event.class, Integer.valueOf(id));
		return event;
	}

	// add an event to the Even table
	@Override

	public boolean add(Event event) {

		// checking if user doesn't already exist
		UserDAOImpl userTmp = new UserDAOImpl();
		if (userTmp.getByEmail(event.getEmail()) == null) {
			// adding user
			User user = new User();
			user.setFirstName(event.getUserFirstName());
			user.setLastName(event.getUserLastName());
			user.setEmail(event.getEmail());
			userTmp.add(user);

			try {
				// adding event
				Session session = sessionFactory.getCurrentSession();
				// start transaction
				session.beginTransaction();

				// Saving the object
				session.save(event);
				// Commit transaction
				session.getTransaction().commit();
				sessionFactory.close();
				return true;
			} catch (Exception ex) {
				ex.printStackTrace();
				return false;
			}

		} 
		//adding only the event, user already existing in database
		else {
			try {
				Session session = sessionFactory.getCurrentSession();
				// start transaction
				session.beginTransaction();

				// Saving the object
				session.save(event);
				// Commit transaction
				session.getTransaction().commit();
				sessionFactory.close();
				return true;
			} catch (Exception ex) {
				ex.printStackTrace();
				return false;
			}

		}
	}

	// updating a certain event
	@Override
	public boolean update(Event event) {
		try {
			Session session = sessionFactory.getCurrentSession();
			// start transaction
			session.beginTransaction();

			// Saving the object
			session.update(event);
			// Commit transaction
			session.getTransaction().commit();
			sessionFactory.close();
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	// Deleting a certain event
	@Override
	public boolean delete(Event event) {
		try {
			Session session = sessionFactory.getCurrentSession();
			// start transaction
			session.beginTransaction();

			// Saving the object
			session.delete(event);
			// Commit transaction
			session.getTransaction().commit();
			sessionFactory.close();
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

}
