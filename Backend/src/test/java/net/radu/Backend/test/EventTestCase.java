package net.radu.Backend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.radu.Backend.dao.EventDAO;
import net.radu.Backend.dto.Event;

public class EventTestCase {

	private static AnnotationConfigApplicationContext context;
	
	private static EventDAO eventDAO;
	private Event event;
	
	@BeforeClass
	public static void init(){
		context = new AnnotationConfigApplicationContext();
		context.scan("net.radu.Backend.");
//		context.scan("net.radu.Backend.daoimpl");
//		context.scan("net.radu.Backend.config");
		context.refresh();
		eventDAO =(EventDAO) context.getBean("eventDAO");
	}
	
	@Test
	public void TestAddEvent(){
		event = new Event();
		event.setEventId(1);
		event.setuId(1);
		event.setDescription("eveniment 1");
		event.setName("test1");
		event.setTag("Natural_Disaster");
		
		assertEquals("succesfully added event in Event table",true,eventDAO.add(event));
	
	}
	
}
