package net.radu.Frontend.obj;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository("events")
public class Event {

	private int eventId;
	private int uId;
	private String name;
	private String description;
	private String tag;
	private Date date;

	private static List<Event> events = new ArrayList<>();

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", uId=" + uId + ", name=" + name + ", description=" + description
				+ ", tag=" + tag + ", date=" + date + "]";
	}

	public List<Event> list() {

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

		return events;
	}
}
