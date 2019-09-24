package uk.co.sophomores.todolistdoover.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;


/**
 * Task object, contains all info regarding
 * this task
 * @author KEN19171868
 */
@Entity
@Table(name="task")
public class Task {

	private long id;
	private String name, description, user, priority;
	
	
	// Constructors
	public Task() {
	}

	public Task(String name, String description, String priority) {
		this.name = name;
		this.description = description;
		this.priority = priority;
		
		
	}

	// Getters & Setters
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name="name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name="description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Column(name="user")
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Column(name="priority")
	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}
	
	
	// Methods
	public String toString() {
		return name + " " + description; 
	}

	
	
	
	
	
}
