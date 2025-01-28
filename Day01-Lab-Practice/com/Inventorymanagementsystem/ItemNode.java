package com.Inventorymanagementsystem;
// Node class to represent an item in the inventory
public class ItemNode {
	// Stores the name of the item
	String itemName;

	// Stores the unique ID of the item
	int itemId;

	// Stores the quantity of the item in stock
	int quantity;

	// Stores the price of a single unit of the item
	double price;

	// Points to the next node in the linked list
	ItemNode next;

	// Constructor to initialize a new node
	public ItemNode(String itemName, int itemId, int quantity, double price) {
		this.itemName = itemName;
		this.itemId = itemId;
		this.quantity = quantity;
		this.price = price;
		this.next = null;
	}
}