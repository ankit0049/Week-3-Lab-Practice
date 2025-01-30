package com.hashmapimplementations;

// Class to test the CustomHashMap implementation
class CustomHashMapMain {
	public static void main(String[] args) {
		// Creates an instance of CustomHashMap with a capacity of 10
		CustomHashMap map = new CustomHashMap(10);

		// Inserts key-value pairs into the map
		map.put(1, 100);
		map.put(2, 200);
		map.put(3, 300);

		// Retrieves values based on keys
		// returning the 100
		System.out.println("Value for key 1: " + map.get(1));
		// returning the 200
		System.out.println("Value for key 2: " + map.get(2));
		 //  returning the 300
		System.out.println("Value for key 3: " + map.get(3));

		// Removes a key-value pair
		map.remove(2);

		// Attempts to retrieve the value for the removed key
		System.out.println("Value for key 2 after removal: " + map.get(2));
	}
}
