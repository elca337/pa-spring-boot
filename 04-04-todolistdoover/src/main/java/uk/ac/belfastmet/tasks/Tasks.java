package uk.ac.belfastmet.tasks;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//try to keep all the package names similar

@Entity
@Table(name = "Todo list app")
public class Tasks {
	
	
	//instance variables
	private long id;
	private String name;
	private String description;
	private String Author;
	private int deadline;
	
	
	
	
	// constructor without fields
	public Tasks() {
		super();
	}
	
	/*
	 * java doc here
	 */

	// constructor with fields
	public Tasks(String name, String description, String author, int deadline) {
		super();
		this.name = name;
		this.description = description;
		Author = author;
		this.deadline = deadline;
	}

	//getters and setters
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
	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}
    
	
	public int getDeadline() {
		return deadline;
	}

	public void setDeadline(int deadline) {
		this.deadline = deadline;
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