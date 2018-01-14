package net.radu.Backend.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import net.radu.Backend.dto.Event;


public interface EventDAO {

	boolean add(Event event);
	
	List<Event> list();
	Event get(int id);
	
}
