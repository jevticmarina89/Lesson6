package exercises;

import java.util.ArrayList;
import java.util.Random;

/* 
 * Make 2 ArrayLists; 
 *      1 full of adjectives (e.g. slimy, blind)
 *      1 full of plural nouns (e.g. pants, bones)
 *      
 * When the program is run, one word is randomly selected from each list to generate a band name.
*/
public class BandNameGenerator {
	public static void main(String[] args) {

		ArrayList<String> adjectives = new ArrayList<String>();
		adjectives.add("red");
		adjectives.add("blind");
		adjectives.add("acid");
		adjectives.add("electric");
		adjectives.add("stoned");

		ArrayList<String> plNouns = new ArrayList<String>();
		plNouns.add("wizards");
		plNouns.add("bones");
		plNouns.add("scissors");
		plNouns.add("people");
		plNouns.add("sessions");

		int firstWord = new Random().nextInt(adjectives.size());

		int secondWord = new Random().nextInt(plNouns.size());
		
		
		System.out.println(adjectives.get(firstWord) + " " + plNouns.get(secondWord));
	}

}
