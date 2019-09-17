package uk.ac.belfastmet;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
		
		Dwarf sleepy = new Dwarf();
		sleepy.setName("Sleepy");
		sleepy.setAuthor("Disney");
		dwarfs.add(sleepy);
		
		Dwarf happy = new Dwarf();
		happy.setName("Happy");
		happy.setAuthor("Disney");
		dwarfs.add(happy);
		
		Dwarf doc = new Dwarf();
		doc.setName("doc");
		doc.setAuthor("Disney");
		dwarfs.add(doc);
		
		Dwarf Bashful = new Dwarf();
		Bashful.setName("Bashful");
		Bashful.setAuthor("Disney");
		dwarfs.add(Bashful);
		
		Dwarf thorin = new Dwarf();
		thorin.setName("Thorin");
		thorin.setAuthor("Tolkien");
		dwarfs.add(thorin);
		
		Dwarf dwalin = new Dwarf();
		dwalin.setName("Dwalin");
		dwalin.setAuthor("Tolkien");
		dwarfs.add(dwalin);
		
		System.out.println("The Dwarfs are: ");
		
		for (Dwarf dwarf:dwarfs) {
			System.out.println(dwarf.getName() + "  " + dwarf.getAuthor());
		}
		
		System.out.println("the disney dwarfs are:  ");
		for (Dwarf dwarf:dwarfs) {
			if (dwarf.getAuthor() == "Disney")
				System.out.println(dwarf.getName());
		}
		
		System.out.println("the Tolkien dwarfs are:  ");
		for (Dwarf dwarf:dwarfs) {
			if (dwarf.getAuthor() == "Tolkien")
				System.out.println(dwarf.getName());
		}
		

	}

}
