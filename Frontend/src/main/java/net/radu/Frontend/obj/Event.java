package net.radu.Frontend.obj;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Transient;

import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

@Repository("events")
public class Event {

	private int eventId;
	private String userFirstName;
	private String userLastName;
	private String email;
	private String eventName;
	private String country;
	private String city;
	private String description;
	private String tag;
	private int allertCode;
	private Date date;

	@Transient
	private MultipartFile picture;
	
	private static List<Event> events = new ArrayList<>();




	public int getEventId() {
		return eventId;
	}



	public void setEventId(int eventId) {
		this.eventId = eventId;
	}



	public String getUserFirstName() {
		return userFirstName;
	}



	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}



	public String getUserLastName() {
		return userLastName;
	}



	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getEventName() {
		return eventName;
	}



	public void setEventName(String eventName) {
		this.eventName = eventName;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
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



	public int getAllertCode() {
		return allertCode;
	}



	public void setAllertCode(int allertCode) {
		this.allertCode = allertCode;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}


	

	public List<Event> list() {

		Event event = new Event();
		event.setEventId(1);
		event.setUserFirstName("Alex");
		event.setUserLastName("Pana");
		event.setEmail("alex@gmail.com");
		event.setDescription("Near Gara de nord an apartment flat is burning");
		event.setEventName("Fire");
		event.setTag("Accident");
		event.setCountry("Romania");
		event.setCity("Bucharest");
		event.setAllertCode(1);
		event.setDate(new Date(2017, 12, 12, 13, 01));
		events.add(event);

		event = new Event();
		event.setEventId(2);
		event.setUserFirstName("Radu");
		event.setUserLastName("Negoita");
		event.setEmail("negolas@gmail.com");
		event.setDescription("Avalanche that destroyed 2 houses in Paltinis");
		event.setEventName("Avalanche");
		event.setTag("Natural_Disaster");
		event.setCountry("Romania");
		event.setCity("Paltinis");
		event.setAllertCode(2);
		event.setDate(new Date(2017, 12, 29, 17, 00));
		events.add(event);

		event = new Event();
		event.setEventId(3);
		event.setUserFirstName("Ivan");
		event.setUserLastName("Molotv");
		event.setEmail("ivan@gmail.com");
		event.setDescription("Earthquake that collapsed a few buildings in Volgograd");
		event.setEventName("Earthquacke");
		event.setTag("Natural_Disaster");
		event.setCountry("Russia");
		event.setCity("Volgograd");
		event.setAllertCode(3);
		event.setDate(new Date(2016, 04, 30, 06, 48));
		events.add(event);

		event = new Event();
		event.setEventId(4);
		event.setUserFirstName("Lebron");
		event.setUserLastName("James");
		event.setEmail("lj@gmail.com");
		event.setDescription("2 planes just crashed in World Trade Center");
		event.setEventName("Possibly terrorist atack");
		event.setTag("Terrorist_Act");
		event.setCountry("USA");
		event.setCity("New York");
		event.setAllertCode(3);
		event.setDate(new Date(2001, 9, 11, 10, 28));
		events.add(event);

		event = new Event();
		event.setEventId(5);
		event.setUserFirstName("Tyrone");
		event.setUserLastName("Queen");
		event.setEmail("queen@gmail.com");
		event.setDescription("Accident involvin huge number of cars on A1");
		event.setEventName("Accident");
		event.setTag("Accident");
		event.setCountry("Romania");
		event.setCity("Pitesti");
		event.setAllertCode(1);
		event.setDate(new Date(2018, 1, 13, 20, 00));
		events.add(event);

		event = new Event();
		event.setEventId(6);
		event.setUserFirstName("Alexandru");
		event.setUserLastName("Vintila");
		event.setEmail("avinti@gmail.com");
		event.setDescription("A group of armed men are holding hostages in gara de nord");
		event.setEventName("Hostage situation");
		event.setTag("Terrorist_Act");
		event.setCountry("Romania");
		event.setCity("Bucharest");
		event.setAllertCode(1);
		event.setDate(new Date(2016, 11, 5, 14, 00));
		events.add(event);

		event = new Event();
		event.setEventId(7);
		event.setUserFirstName("Maria");
		event.setUserLastName("Westminster");
		event.setEmail("mwest@gmail.com");
		event.setDescription("Huge landslide on county road A64 near York");
		event.setEventName("Land slide");
		event.setTag("Natural_Disaster");
		event.setCountry("United Kingdoms");
		event.setCity("York");
		event.setAllertCode(2);
		event.setDate(new Date(2016, 06, 04, 21, 17));
		events.add(event);
		
		return events;
	}



	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", userFirstName=" + userFirstName + ", userLastName=" + userLastName
				+ ", email=" + email + ", eventName=" + eventName + ", country=" + country + ", city=" + city
				+ ", description=" + description + ", tag=" + tag + ", allertCode=" + allertCode + ", date=" + date
				+ "]";
	}



	public MultipartFile getPicture() {
		return picture;
	}



	public void setPicture(MultipartFile picture) {
		this.picture = picture;
	}




}
