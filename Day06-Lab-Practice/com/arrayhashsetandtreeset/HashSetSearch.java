package com.arrayhashsetandtreeset;
import java.util.HashSet;
import java.util.Random;

public class HashSetSearch {
	public static boolean searchHashSet(HashSet<Integer> hashSet, int key) {
		// Uses HashSet's contains() method to check for key existence
		return hashSet.contains(key);
	}

	public static long computeAndMeasure(int[] arr, int key) {
		// Creates a HashSet of integers to store unique values
		HashSet<Integer> hashSet = new HashSet<>();

		// Populates the HashSet with sequential values
		for (int j : arr) {
			hashSet.add(j);
		}

		// Records the start time before the search operation begins
		long startTime = System.nanoTime();

		// Performs a search in the HashSet
		boolean found = searchHashSet(hashSet, key);

		// Records the end time after the search operation finishes
		long endTime = System.nanoTime();

		// Prints whether the key was found
		System.out.println("HashSet Search Result: " + found);

		// Calculates and returns the total execution time in milliseconds
		return (endTime - startTime) / 1000000;
	}
}
