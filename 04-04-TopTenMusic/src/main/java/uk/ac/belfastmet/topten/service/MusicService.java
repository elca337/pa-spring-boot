package uk.ac.belfastmet.topten.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.topten.domain.Music;


// Spring service
@Service
public class MusicService {
		
	private ArrayList<Music> topTenMusic;
	
	// Music top ten array	
	public ArrayList<Music> getTopTenMusic(){
			
			this.topTenMusic = new ArrayList<Music>();
			// add Music here 
			this.topTenMusic.add(new Music("U2", "Joshua Tree", "joshuatree_album.jpg"));
			this.topTenMusic.add(new Music("Pink Floyd", "Dark Side of the moon", "pinkfloyd.jpg"));
			this.topTenMusic.add(new Music("Jimi Hendrix", "Are you Experienced?", "hendrix.jpg"));
			this.topTenMusic.add(new Music("Dr Dre", "2001", "drdre.png"));
			this.topTenMusic.add(new Music("Tool", "Lateralus", "Lateralus.jpg"));
			this.topTenMusic.add(new Music("Luke Kelly", "The Definitive Collection", "lukekelly.jpg"));
			this.topTenMusic.add(new Music("Led Zeppelin", "Mothership", "Mothership.jpg"));
			this.topTenMusic.add(new Music("Queens of the Stone Age", "Songs for the Deaf", "qotsa.png"));
			this.topTenMusic.add(new Music("Rage Against the Machine", "Rage Against The Machine", "RATM.jpg"));
			this.topTenMusic.add(new Music("Radiohead", "OK Computer", "okcomputer.jpg"));
			
			
			
			return this.topTenMusic;
		}
		
	 


	}


