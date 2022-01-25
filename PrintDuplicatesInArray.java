package week1.day2.classroom.arrays;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {

		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		System.out.println("The Duplicates are - ");
		int len = arr.length;// get the length of the array
		int count;// declare an int variable named count
		int i, j;
		count = 0; // assign 0 to count
		for (i = 0; i < len; i++)// iterate from 0 to the array length-1 (outer loop starts here)
		{
			for (j = i + 1; j < len; j++) // iterate from i to the length of the array by adding 1 to it (inner loop
											// starts here)
			{

				if (arr[i] == arr[j])// compare both the loop variables & check they're equal
				{
					count = count + 1; // increase the count if both the arrays are equal

					if (count >= 1) // Out of the inner loop, check and print the first array variable if count is
									// more than 0

						System.out.println(arr[j]);
				}
			}
		}
	}
}
