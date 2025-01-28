package com.Inventorymanagementsystem;

public class InventoryManagementSystem {

	// Reference to the head node of the linked list
	private ItemNode head;

	// Constructor to initialize an empty inventory
	public InventoryManagementSystem() {
		this.head = null;
	}

	// Adds an item at the beginning of the linked list
	public void addItemAtBeginning(String itemName, int itemId, int quantity, double price) {
		ItemNode newItem = new ItemNode(itemName, itemId, quantity, price);
		newItem.next = head;
		head = newItem;
	}

	// Adds an item at the end of the linked list
	public void addItemAtEnd(String itemName, int itemId, int quantity, double price) {
		ItemNode newItem = new ItemNode(itemName, itemId, quantity, price);
		if (head == null) {
			head = newItem;
			return;
		}
		ItemNode current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newItem;
	}

	// Adds an item at a specific position in the linked list
	public void addItemAtPosition(String itemName, int itemId, int quantity, double price, int position) {
		ItemNode newItem = new ItemNode(itemName, itemId, quantity, price);
		if (position == 1) {
			newItem.next = head;
			head = newItem;
			return;
		}
		ItemNode current = head;
		for (int i = 1; i < position - 1 && current != null; i++) {
			current = current.next;
		}
		if (current == null) {
			System.out.println("Position out of range.");
			return;
		}
		newItem.next = current.next;
		current.next = newItem;
	}

	// Removes an item from the inventory based on its unique ID
	public void removeItemById(int itemId) {
		if (head == null) {
			System.out.println("Inventory is empty.");
			return;
		}
		if (head.itemId == itemId) {
			head = head.next;
			return;
		}
		ItemNode current = head;
		while (current.next != null && current.next.itemId != itemId) {
			current = current.next;
		}
		if (current.next == null) {
			System.out.println("Item not found.");
			return;
		}
		current.next = current.next.next;
	}

	// Updates the quantity of an item by its unique ID
	public void updateQuantityById(int itemId, int newQuantity) {
		ItemNode current = head;
		while (current != null && current.itemId != itemId) {
			current = current.next;
		}
		if (current == null) {
			System.out.println("Item not found.");
			return;
		}
		current.quantity = newQuantity;
	}

	// Searches for an item by either its ID or name
	public void searchItem(int itemId, String itemName) {
		boolean found = false;
		ItemNode current = head;
		while (current != null) {
			if (current.itemId == itemId || current.itemName.equalsIgnoreCase(itemName)) {
				System.out.println("Item Found: " + current.itemName + ", ID: " + current.itemId +
					   ", Quantity: " + current.quantity + ", Price: " + current.price);
				found = true;
			}
			current = current.next;
		}
		if (!found) {
			System.out.println("Item not found.");
		}
	}

	// Calculates and displays the total value of the inventory
	public void calculateTotalInventoryValue() {
		double totalValue = 0;
		ItemNode current = head;
		while (current != null) {
			totalValue += current.quantity * current.price;
			current = current.next;
		}
		System.out.println("Total Inventory Value: " + totalValue);
	}


	// Sort the inventory based on Item Name or Price
	public void sortInventory(String criterion, boolean ascending) {
		if (head == null || head.next == null) return;
		ItemNode sorted = null;
		ItemNode current = head;

		while (current != null) {
			ItemNode nextItem = current.next;
			current.next = null;

			if (sorted == null || (criterion.equals("price") ? current.price < sorted.price : current.itemName.compareTo(sorted.itemName) < 0) && ascending ||
				   !ascending && (criterion.equals("price") ? current.price > sorted.price : current.itemName.compareTo(sorted.itemName) > 0)) {
				current.next = sorted;
				sorted = current;
			} else {
				ItemNode temp = sorted;
				while (temp.next != null && (criterion.equals("price") ? current.price > temp.next.price : current.itemName.compareTo(temp.next.itemName) > 0) && ascending ||
					   !ascending && (criterion.equals("price") ? current.price < temp.next.price : current.itemName.compareTo(temp.next.itemName) < 0)) {
					temp = temp.next;
				}
				current.next = temp.next;
				temp.next = current;
			}
			current = nextItem;
		}

		head = sorted;
	}

	// Displays all items in the inventory
	public void displayInventory() {
		if (head == null) {
			System.out.println("Inventory is empty.");
			return;
		}
		ItemNode current = head;
		System.out.println("Inventory Items:");
		while (current != null) {
			System.out.println("Name: " + current.itemName + ", ID: " + current.itemId +
				   ", Quantity: " + current.quantity + ", Price: " + current.price);
			current = current.next;
		}
	}



	// Main method to test the functionalities of the inventory management system
	public static void main(String[] args) {
		// Create an instance of the inventory management system
		InventoryManagementSystem inventory = new InventoryManagementSystem();

		// Add items to the inventory
		inventory.addItemAtEnd("Laptop", 101, 5, 50000);
		inventory.addItemAtBeginning("Phone", 102, 10, 30000);
		inventory.addItemAtPosition("Tablet", 103, 7, 20000, 2);

		// Display the inventory
		inventory.displayInventory();

		// Remove an item by ID
		inventory.removeItemById(102);

		// Update the quantity of an item
		inventory.updateQuantityById(103, 15);

		// Display the inventory after updates
		inventory.displayInventory();

		// Search for an item
		inventory.searchItem(101, "");

		// Calculate and display the total inventory value
		inventory.calculateTotalInventoryValue();


		System.out.println("\nSort by Price (Ascending):");
		inventory.sortInventory("price", true);
		inventory.displayInventory();


	}
}
