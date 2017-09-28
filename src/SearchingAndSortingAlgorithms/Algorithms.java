package SearchingAndSortingAlgorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int bleh = 0;
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("whole")) {
				bleh += 1;
			} else {
				return bleh;
			}
		}
		return 1;
	}
	
	public static int countPearls(List<Boolean> oysters) {
		int bleh = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i)) {
				bleh += 1;
			}
		}
		return bleh;
	}
	
	public static double findTallest(List<Double> peeps) {
		double tallest = 0.0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > tallest) {
				tallest = peeps.get(i);
			}
		}
		return tallest;
	}
	
	public static String findLongestWord(List<String> words) {
		String longest = "hi";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > longest.length()) {
				longest = words.get(i);
			}
		}
		return longest;
	}
	
	public static boolean containsSOS(List<String> messages) {
		for (int i = 0; i < messages.size(); i++) {
			if (messages.get(i).contains("... --- ...")) {
				return true;
			}
		}
		return false;
	}
	
	//Add other methods here
}