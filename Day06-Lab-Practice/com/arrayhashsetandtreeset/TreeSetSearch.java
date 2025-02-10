package com.arrayhashsetandtreeset;
import java.util.TreeSet;

public class TreeSetSearch {

	public static boolean searchTreeSet(TreeSet<Integer> treeSet, int key) {
		// Uses TreeSet's contains() method to check for key existence
		return treeSet.contains(key);
	}

	public static long computeAndMeasure(int[] arr, int key) {
		// Creates a TreeSet to store unique values in a sorted manner
		TreeSet<Integer> treeSet = new TreeSet<>();

		// Populates the TreeSet with sequential values
		for (int i = 0; i < arr.length; i++) {
			treeSet.add(arr[i]);
		}

		// Records the start time before the search operation begins
		long startTime = System.nanoTime();

		// Performs a search in the TreeSet
		boolean found = searchTreeSet(treeSet, key);

		// Records the end time after the search operation finishes
		long endTime = System.nanoTime();

		// Prints whether the key was found
		System.out.println("TreeSet Search Result: " + found);

		// Calculates and returns the total execution time in milliseconds
		return (endTime - startTime) / 1000000;
	}
}
