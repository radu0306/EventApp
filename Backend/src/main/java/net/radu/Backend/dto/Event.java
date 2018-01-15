package net.radu.Backend.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "event")
public class Event {

	
	@Id
	@Column(name = "idEvent")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	@Column(name = "reportedDate")
	private Date date;
	
	@Transient
	private MultipartFile picture;
	
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
