package uk.ac.belfastmet.topten.domain;

public class Music {
	
	
	// instance variables
	private String name;
	private String album;
	private String artist;
	
	// constructor without fields
	public Music() {
		super();
	}

	// constructor with fields
	public Music(String name, String album, String artist) {
		super();
		this.name = name;
		this.album = album;
		this.artist = artist;
	}

	// getters and setters
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAlbum() {
		return album;
	}


	public void setAlbum(String album) {
		this.album = album;
	}


	public String getArtist() {
		return artist;
	}


	public void setArtist(String artist) {
		this.artist = artist;
	}


}
