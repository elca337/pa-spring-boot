package uk.ac.belfastmet.dwarfs.domain;

public class Dwarf {
	
	
	// instance variables
	private String name;
	private String author;
	private String image;
	
	
	
	// constructor without fields
	public Dwarf() {
		super();
	}
	
	
	
	//constructor with fields
	public Dwarf(String name, String author, String image) {
		super();
		this.name = name;
		this.author = author;
		this.image = image;
	}



    // getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	

}
