package net.radu.Backend.daoimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.radu.Backend.dao.EventDAO;
import net.radu.Backend.dto.Event;

@Repository("eventDAO")
public class EventDAOImpl implements EventDAO {

	private static List<Event> events = new ArrayList<>();
	
	static{
		Event event = new Event();
		event.setEventId(1);
		event.setuId(1);
		event.setDescription("eveniment 1");
		event.setName("test1");
		event.setTag("Natural_Disaster");
		event.setDate(new Date(2017, 12, 12, 13, 01));
		events.add(event);
		
		event = new Event();
		event.setEventId(2);
		event.setuId(2);
		event.setDescription("eveniment 2");
		event.setName("test2");
		event.setTag("Natural_Disaster");
		event.setDate(new Date(2017, 12, 12, 13, 02));
		events.add(event);
		
		event = new Event();
		event.setEventId(3);
		event.setuId(3);
		event.setDescription("eveniment 3");
		event.setName("test3");
		event.setTag("Terrorist_Act");
		event.setDate(new Date(2017, 12, 12, 13, 03));
		events.add(event);
		
		event = new Event();
		event.setEventId(4);
		event.setuId(4);
		event.setDescription("eveniment4 ");
		event.setName("test4");
		event.setTag("Accident");
		event.setDate(new Date(2017, 12, 12, 13, 04));
		events.add(event);
	}
	
	@Override
	public List<Event> lsit() {
		return events;
	}

}
