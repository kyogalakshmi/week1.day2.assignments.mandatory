package week1.day2.assignments.mandatory;

public class CharOccurance {

	public static void main(String[] args) {

		// Check number of occurrences of a char (eg 'e') in a String

		String str = "welcome to chennai";

		int count = 0;// declare and initialize a variable count to store the number of occurrences

		char[] strchar = str.toCharArray(); // convert the string into char array

		int len = str.length();// get the length of the array
		char character = 'e';
		for (int i = 0; i < len; i++)// traverse from 0 till the array length
		{
			if (strchar[i] == character) // Check the char array has the particular char in it
			{
				count++; // if is has increment the count

			}

		}
		System.out.println("The Character '" + character + "' appears " + count + " times."); // print the count out of
																								// the loop
	}

}
