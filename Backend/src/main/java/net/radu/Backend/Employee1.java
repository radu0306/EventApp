package net.radu.Backend;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="employee", 
	   uniqueConstraints={@UniqueConstraint(columnNames={"id"})})
public class Employee1 {

	@Id
	
	@Column(name="id")
	private int id;
	
	@Column(name="name", length=20, nullable=true)
	private String name;
	
	@Column(name="role", length=20, nullable=true)
	private String role;
	
	@Column(name="insertTime", nullable=true)
	private Date insertTime;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Date getInsertTime() {
		return insertTime;
	}
	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}
}
