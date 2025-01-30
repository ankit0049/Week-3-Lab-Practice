package com.hashmapimplementations;
import  java.util.LinkedList;
// Class to represent a custom HashMap implementation
class CustomHashMap {
	// Array of linked lists to store the key-value pairs
	private LinkedList<Entry>[] table;

	// Class to represent key-value pairs
	private class Entry {
		// Stores the key for the entry
		int key;

		// Stores the value for the entry
		int value;

		// Constructor to initialize the entry with key and value
		Entry(int key, int value) {
			this.key = key;
			this.value = value;
		}
	}

	// Constructor to initialize the hash map with a fixed capacity
	public CustomHashMap(int capacity) {
		// Initializes the table (array of linked lists)
		table = new LinkedList[capacity];

		// Initializes each bucket in the array as a new linked list
		for (int i = 0; i < capacity; i++) {
			table[i] = new LinkedList<>();
		}
	}

	// Method to compute the hash for a given key
	private int getHash(int key) {
		// Uses the modulus operator to ensure the hash is within the table size
		return key % table.length;
	}

	// Method to insert or update a key-value pair into the hash map
	public void put(int key, int value) {
		// Computes the hash for the key
		int hash = getHash(key);

		// Retrieves the linked list at the computed hash index
		LinkedList<Entry> bucket = table[hash];

		// Searches for an existing entry with the given key
		for (Entry entry : bucket) {
			if (entry.key == key) {
				// If key is found, update the value
				entry.value = value;
				return;
			}
		}

		// If key is not found, add a new entry to the bucket
		bucket.add(new Entry(key, value));
	}

	// Method to retrieve the value associated with a key
	public int get(int key) {
		// Computes the hash for the key
		int hash = getHash(key);

		// Retrieves the linked list at the computed hash index
		LinkedList<Entry> bucket = table[hash];

		// Searches for the key in the linked list
		for (Entry entry : bucket) {
			if (entry.key == key) {
				// If key is found, return the value
				return entry.value;
			}
		}

		// If key is not found, return -1 to indicate non-existence
		return -1;
	}

	// Method to remove a key-value pair from the hash map
	public void remove(int key) {
		// Computes the hash for the key
		int hash = getHash(key);

		// Retrieves the linked list at the computed hash index
		LinkedList<Entry> bucket = table[hash];

		// Iterates over the linked list to find the entry to remove
		for (Entry entry : bucket) {
			if (entry.key == key) {
				// If key is found, remove the entry from the bucket
				bucket.remove(entry);
				return;
			}
		}
	}
}
