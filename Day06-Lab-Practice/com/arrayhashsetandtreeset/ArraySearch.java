package com.arrayhashsetandtreeset;
import java.util.Random;

public class ArraySearch {

	public static boolean searchArray(int[] array, int key) {
		// Iterates through the array to find the key
		for (int num : array) {
			// Checks if the current element matches the key
			if (num == key) {
				return true;
			}
		}

		// Returns false if the key is not found
		return false;
	}

	public static long computeAndMeasure(int[] array, int key) {
		// Records the start time before the search operation begins
		long startTime = System.nanoTime();

		// Performs a linear search in the array
		boolean foundElement = searchArray(array, key);

		// Records the end time after the search operation finishes
		long endTime = System.nanoTime();

		// Prints whether the key was found
		System.out.println("Array Search Result: " + foundElement);

		// Calculates and returns the total execution time in milliseconds
		return (endTime - startTime) / 100000;
	}
}
