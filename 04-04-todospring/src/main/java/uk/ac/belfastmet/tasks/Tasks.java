package uk.ac.belfastmet.tasks;

//try to keep all the package names similar

public class Tasks {
	
	
	//instance variables
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
	
	
	
	

}
