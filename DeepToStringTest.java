// Example copied from 
// https://www.geeksforgeeks.org/arrays-deeptostring-in-java-with-example/

import java.util.Arrays;

public class DeepToStringTest {
	// Java program to demonstrate that toString works if we
	// want to print single dimensional array, but doesn't work
	// for multidimensional array.
	public static void main(String[] args)
	{
		// Trying to print array of strings using toString
		int arr[] = {1, 2, 3, 4};
		String[] strs = new String[] {"first string", "second string"};
		System.out.println(arr.toString());
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(strs));

		// Trying to print multidimensional array using
		// toString
		int[][] mat = new int[2][2];
		mat[0][0] = 99;
		mat[0][1] = 151;
		mat[1][0] = 30;
		mat[1][1] = 50;
		System.out.println(Arrays.toString(mat));
		System.out.println(Arrays.deepToString(mat));
	}
}
