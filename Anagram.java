package week1.day2.assignments.mandatory;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		/*
		 * Pseudo Code
		 * 
		 * Declare a String String text1 = "stops"; Declare another String String text2
		 * = "potss"; a) Check length of the strings are same then (Use A Condition) b)
		 * Convert both Strings in to characters c) Sort Both the arrays d) Check both
		 * the arrays has same value
		 * 
		 */
		String text1 = "stops";
		String text2 = "potss";

		if (text1.length() != text2.length()) {
			System.out.println("Both the strings are not anagram");
		} else {
			char[] textchar1 = text1.toCharArray();
			char[] textchar2 = text2.toCharArray();
			Arrays.sort(textchar1);
			Arrays.sort(textchar2);

			if (Arrays.equals(textchar1, textchar2)) {
				System.out.println("Both the strings are anagram");
			} else {
				System.out.println("Both the strings are not anagram");
			}
		}
	}
}