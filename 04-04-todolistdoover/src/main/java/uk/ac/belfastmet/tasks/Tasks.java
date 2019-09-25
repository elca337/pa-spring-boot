package uk.ac.belfastmet.tasks;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "task")
public class Tasks {	
	//instance variables
	public String name;
	public String description;
	public String user;
	public String priority;
	public long id;
		
	
	// constructor without fields
	public Tasks() {
		super();
	}	
	/*
	 * @param parameters are the instance variables on lines 15 - 19
	 * @return constructed fields using "this."
	 */	
	public Tasks(String name, String description, String priority, String user, long id) {
		super();
		this.name = name;
		this.description = description;
		this.setUser(user);
		this.priority = priority;
		this.id = id;
	}
	//getters and setters
	
	/*
	 * @param getters and setters
	 * @return returns instance variables
	 */	
	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Column(name = "user")
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	@Column(name = "priority")
	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}
    
	

	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}	

}