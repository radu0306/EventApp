package net.radu.Backend.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import net.radu.Backend.config.HibernateUtil;
import net.radu.Backend.dao.UserDAO;
import net.radu.Backend.daoimpl.UserDAOImpl;
import net.radu.Backend.dto.User;


public class UsertInsertionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<User> users = new ArrayList<>();

		User user = new User();

		//user.setuID(1);
		user.setFirstName("Lebron");
		user.setLastName("James");
		user.setEmail("lj@gmail.com");
		
		
		SessionFactory sessionFactory = HibernateUtil.getSessionAnnotationFactory();
		Session session = sessionFactory.getCurrentSession();
		
		// Table insertion
		// Get Session
		// start transaction
//		 session.beginTransaction();
		// Save the Model object
//		 session.save(user);
		// //Commit transaction
//		 session.getTransaction().commit();
//		 System.out.println("User ID="+user.getuID());

		// Table extraction

		// start transaction
//		session.beginTransaction();
//		String selectUser = "FROM User";//
//		Query query = sessionFactory.getCurrentSession().createQuery(selectUser);
//		users = query.list();
//		System.out.println(users);

		//Geting user by email
		
		//start transaction
		
		session.beginTransaction();
		

		String selectUser = "FROM User WHERE email = :email";
		Query query = sessionFactory.getCurrentSession().createQuery(selectUser);
		
		query.setParameter("email", "beatrice.skittles@gmail.com");
		user = (User) query.uniqueResult();
		System.out.println("Datele userului cu mailul beatrice.skittles@gmail.com sunt: " + user);
		sessionFactory.close();
	}
}
