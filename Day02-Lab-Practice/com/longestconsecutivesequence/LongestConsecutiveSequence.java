package com.longestconsecutivesequence;

import java.util.HashSet;
import java.util.Set;


// Class to find the longest consecutive sequence in an array
class LongestConsecutiveSequence {
	// Method to compute the longest consecutive sequence
	public static int findLongestConsecutiveSequence(int[] array) {
		// Creates a HashSet to store all unique elements from the array
		Set<Integer> numSet = new HashSet<>();

		// Adds all elements from the array to the HashSet for quick lookups
		for (int num : array) {
			numSet.add(num);
		}

		// Variable to keep track of the maximum sequence length
		int longestStreak = 0;

		// Iterates through each element in the array
		for (int num : array) {
			// Checks if the current number is the start of a sequence
			if (!numSet.contains(num - 1)) {
				// Initializes the current number for sequence tracking
				int currentNum = num;

				// Initializes the current sequence length
				int currentStreak = 1;

				// Continues checking for the next consecutive numbers
				while (numSet.contains(currentNum + 1)) {
					// Moves to the next consecutive number
					currentNum++;

					// Increments the current sequence length
					currentStreak++;
				}

				// Updates the maximum sequence length found so far
				longestStreak = Math.max(longestStreak, currentStreak);
			}
		}

		// Returns the longest consecutive sequence length
		return longestStreak;
	}
}