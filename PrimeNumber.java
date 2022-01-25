package week1.day1.assignment;

public class PrimeNumber {

	/*
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * input: 13 output: 13 is a Prime Number
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter 3) To create an 'if' condition: type 'if', followed by ctrl + space
	 * +down arrow + enter
	 * 
	 *  What are my learnings from this code? 1)Looping structures 2)Logical thinking
	 * 3)Ease of code practice
	 * 
	 */

	public static void main(String[] args) {

		int input = 13;// Declare an int Input and assign a value 13

		boolean flag = false;// Declare a boolean variable flag as false

		for (int i = 2; i <= input / 2; i++)// Iterate from 2 to half of the input

		{

			if (input % i == 0) { // Divide the input with each for loop variable and check the remainder

				flag = true; // Set the flag as true when there is no remainder

				break; // break the iterator
			}
		}
		if (flag == true)// Check the flag (Provide a condition)

			System.out.println(input + " is not a Prime Number"); // Print 'Prime' when the condition matches

		else
			System.out.println(input + " is a Prime Number"); // Print 'Not a Prime' when the condition doesn't match

	}

}