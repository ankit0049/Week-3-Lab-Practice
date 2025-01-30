package com.twosum;

import java.util.HashMap;
// Class to implement the Two Sum problem using a Hash Map
class TwoSum {
	// Method to find two indices such that their values sum up to the target
	public int[] twoSum(int[] nums, int target) {
		// Create a hash map to store the value and its corresponding index
		HashMap<Integer, Integer> map = new HashMap<>();

		// Iterate through the array to find the two numbers
		for (int i = 0; i < nums.length; i++) {
			// Calculate the complement (target - current number)
			int complement = target - nums[i];

			// Check if the complement already exists in the map
			if (map.containsKey(complement)) {
				// If it exists, return the indices of the current number and its complement
				return new int[] { map.get(complement), i };
			}

			// If the complement does not exist, add the current number and its index to the map
			map.put(nums[i], i);
		}

		// If no solution is found, return an empty array
		return new int[] {};
	}
}