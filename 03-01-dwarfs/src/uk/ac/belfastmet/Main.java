package uk.ac.belfastmet;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, world!");
		
		ArrayList<String> dwarfs = new ArrayList<String>();
		dwarfs.add("Happy");
		dwarfs.add("Sleepy");
		dwarfs.add("Dopey");
		dwarfs.add("Bashful");
		dwarfs.add("Sneezy");
		dwarfs.add("Grumpy");
		dwarfs.add("Doc");
		
		System.out.println("the Snow White Dwarfs are: ");
		
		for (String dwarf: dwarfs) {
			System.out.println(dwarf);
		}
		
		ArrayList<String> dwarves = new ArrayList<String>();
		dwarves.add("Thorin");
		dwarves.add("Balin");
		dwarves.add("Dwalin");
		dwarves.add("Fili");
		dwarves.add("Kili");
		dwarves.add("Nori");
		dwarves.add("Oin");
		dwarves.add("Ori");
		dwarves.add("Gloin");
		dwarves.add("Bifur");
		dwarves.add("Bofur");
		dwarves.add("Bombur");
		dwarves.add("Dori");
		
		System.out.println("The Lord of The Rings Dwarves are: ");
		
		for (String dwarve: dwarves) {
			System.out.println(dwarve);
		}
		

	}

}
