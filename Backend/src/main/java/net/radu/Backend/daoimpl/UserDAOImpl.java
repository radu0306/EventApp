package net.radu.Backend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.radu.Backend.config.HibernateUtil;
import net.radu.Backend.dao.UserDAO;
import net.radu.Backend.dto.User;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO {

	@Autowired
	SessionFactory sessionFactory = HibernateUtil.getSessionAnnotationFactory();

	private static List<User> users = new ArrayList<>();
	private static List<User> admins = new ArrayList<>();

	// adding an user to database
	@Override
	public boolean add(User user) {
		try {
			Session session = sessionFactory.getCurrentSession();
			// start transaction
			session.beginTransaction();

			// Saving the object
			session.save(user);
			// Commit transaction
			session.getTransaction().commit();
			sessionFactory.close();
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			sessionFactory.close();
			return false;
		}
	}

	// Geting a certain user
	@Override
	public User get(int UID) {
		Session session = sessionFactory.getCurrentSession();
		//start transaction
		session.beginTransaction();
		
		User user = new User();
		user= (User) session.get(User.class, Integer.valueOf(UID));
		sessionFactory.close();
		return user;
	}

	// updating a certain user
	@Override
	public boolean update(User user) {
		try {
			Session session = sessionFactory.getCurrentSession();
			// start transaction
			session.beginTransaction();

			// Saving the object
			session.update(user);
			// Commit transaction
			session.getTransaction().commit();
			sessionFactory.close();
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			sessionFactory.close();
			return false;
		}
	}

	// deleting a certain user
	@Override
	public boolean delete(User user) {
		try {
			Session session = sessionFactory.getCurrentSession();
			// start transaction
			session.beginTransaction();

			// Saving the object
			session.delete(user);
			// Commit transaction
			session.getTransaction().commit();
			sessionFactory.close();
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			sessionFactory.close();
			return false;
		}
	}

	@Override
	public List<User> list() {
		Session session = sessionFactory.getCurrentSession();

		// start transaction
		session.beginTransaction();

		String selectUser = "FROM User";

		Query query = sessionFactory.getCurrentSession().createQuery(selectUser);

		users = query.list();
		System.out.println(users);

		sessionFactory.close();
		return users;
	}

	//geting user by email
	@Override
	public User getByEmail(String email) {
		Session session = sessionFactory.getCurrentSession();
		//start transaction
		session.beginTransaction();
		
		User user = new User();
		String selectUser = "FROM User WHERE email = :email";
		Query query = sessionFactory.getCurrentSession().createQuery(selectUser);
		query.setParameter("email", email);
		user = (User) query.uniqueResult();
		sessionFactory.close();
		return user;
		
	}

	@Override
	public List<User> getAdmins() {
		Session session = sessionFactory.getCurrentSession();
		//start transaction
		session.beginTransaction();
		
		String selectAdmin = "FROM User WHERE isAdmin = :isAdmin";
		Query query = sessionFactory.getCurrentSession().createQuery(selectAdmin);
		query.setParameter("isAdmin", "true");
		admins =   query.list();
		sessionFactory.close();
		return admins;
	}

}
