package uk.ac.belfastmet;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();

		dwarfs.add(new Dwarf("Lazy", "Disney"));
		dwarfs.add(new Dwarf("Grumpy", "Disney"));
		dwarfs.add(new Dwarf("Dopey", "Disney"));
		dwarfs.add(new Dwarf("Doc", "Disney"));
		dwarfs.add(new Dwarf("Sneezey", "Disney"));
		dwarfs.add(new Dwarf("yeezy", "Disney"));
		dwarfs.add(new Dwarf("happy", "Disney"));

//		for (Dwarf dwarf : dwarfs) {
//			System.out.println(dwarf.getName() + "  " + dwarf.getAuthor());
//		}

		System.out.println("the disney dwarfs are:  ");
		for (Dwarf dwarf : dwarfs) {
			if (dwarf.getAuthor() == "Disney")
				System.out.println(dwarf.getName());
		}

		dwarfs.add(new Dwarf("thorin", "Tolkien"));
		dwarfs.add(new Dwarf("joe", "Tolkien"));
		dwarfs.add(new Dwarf("bob", "Tolkien"));
		dwarfs.add(new Dwarf("lee", "Tolkien"));
		dwarfs.add(new Dwarf("dave", "Tolkien"));
		dwarfs.add(new Dwarf("sean", "Tolkien"));
		dwarfs.add(new Dwarf("mick", "Tolkien"));

//		for (Dwarf dwarf : dwarfs) {
//			System.out.println(dwarf.getName() + "  " + dwarf.getAuthor());
//		}

		System.out.println("the Tolkien dwarfs are:  ");
		for (Dwarf dwarf : dwarfs) {
			if (dwarf.getAuthor() == "Tolkien")
				System.out.println(dwarf.getName());
		}

	}

}
