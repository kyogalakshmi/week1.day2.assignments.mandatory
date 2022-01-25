package week1.day2.assignments.mandatory;

public class ReverseEvenWords {

	// Build a logic to reverse the even position words (output: I ma a erawtfos
	// tester)

	/*
	 * Pseudo Code:
	 * 
	 * Declare the input as Follow String test = "I am a software tester"; a) split
	 * the words and have it in an array b) Traverse through each word (using loop)
	 * c) find the odd index within the loop (use mod operator)
	 * 
	 * d)split the words and have it in an array
	 * 
	 * e)print the even position words in reverse order using another loop (nested
	 * loop) f) Convert words to character array if the position is even else print
	 * the word as it is(concatenate space at the end).
	 * 
	 * 
	 */

	public String reverse(String s) {
		String revString = "";
		char[] char1 = s.toCharArray();
		int len = char1.length;
		for (int i = len - 1; i >= 0; i--) {
			revString = revString + char1[i];
		}
		return revString;
	}

	public static void main(String[] args) {
		String test = "I am a software tester";
		String rev = " ";
		String[] testchar = test.split(" ");
		ReverseEvenWords obj = new ReverseEvenWords();
		for (int i = 0; i < testchar.length; i++) {
			if (i % 2 != 0) {
				testchar[i] = obj.reverse(testchar[i]);
			}
		}
		for (int i = 0; i < testchar.length; i++) {
			rev = rev.concat(testchar[i]) + " ";
		}
		System.out.println("The ReverseEvenWord is - " +rev);

	}
}