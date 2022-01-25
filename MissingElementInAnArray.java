package week1.day2.classroom.arrays;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// Here is the input
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		int i = arr[0];

		Arrays.sort(arr);// Sort the array

		while (i < arr.length) // loop through the array (start i from arr[0] till the length of the array)
		{
			if (arr[i] - arr[i - 1] == 1) {
			} else {
				System.out.println("Missing number is " + (arr[i - 1] + 1));
			}
			i++;
		}
	}
}
