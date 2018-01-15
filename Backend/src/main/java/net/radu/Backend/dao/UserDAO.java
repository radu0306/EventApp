package net.radu.Backend.dao;

import java.util.List;

import net.radu.Backend.dto.User;


public interface UserDAO {

	
	boolean add(User user);
	User get(int UID);
	User getByEmail(String email);
	boolean update(User user);
	boolean delete(User user);
	List<User> list();
	List<User> getAdmins();
}
