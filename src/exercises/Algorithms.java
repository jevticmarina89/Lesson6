package exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Algorithms {

	static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			String egg = eggs.get(i);
			if (egg.contains("crack")) {
				return i;
			}
		}
		return -1;
	}

	static int countPearls(List<Boolean> oysters) {
		for (int i = 0; i < oysters.size(); i++) {
			boolean b = oysters.get(i);
			if (b == true) {
				return i++;
			}
		}
		return 0;
	}

	static double findTallest(List<Double> peeps) {
		double d = 0.0;
		for (double tallest : peeps) {
			if (tallest > d)
				d = tallest;
		}
		return d;
	}

	static String findLongestWord(List<String> words) {
		String longest = "";
		for (String word : words) {
			if (word.length() > longest.length())
				longest = word;
		}
		return longest;
	}

	static boolean containsSOS(List<String>list) {
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			if(s.contains("... --- ...")) 
				return true;
				}
			return false;
		}
	
	static List<Double> sortScores(List<Double>list) {
		list.sort(null);
		return list;
	}
	
	static List<String> sortDNA(List<String>list){
		list.sort(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return (s1.length() - s2.length()); }
			});  
		return list;
	}
	
	public static List<String> sortWords(List<String> list) {
	list.sort(new Comparator<String>() {
		@Override
		public int compare(String s1, String s2) {
			return s1.compareTo(s1);
		}
	});
	return list;
	}
	}
