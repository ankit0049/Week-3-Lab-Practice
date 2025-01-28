package com.librarymanagementsystem;

public class LibraryManagementSystemControlar {
	//Create main method to control the flow of the program
	public static void main(String[] args) {
		//Create object of the library class
		LibraryManagementSystem lms = new LibraryManagementSystem();

		//Performing operation on the object of linkedlist
		lms.addAtEnd("The Ankit Rajput story", "ankit", "Fiction", 24, true);
		lms.addAtBeginning("1984", "George Orwell", "Thakur ankit singh rajput", 102, true);
		lms.addAtPosition(1, "To became king", "ankit rajput", "Classic", 13, false);

		//Display the data of library in forward direction
		System.out.println("All Books (Forward):");
		lms.displayForward();

		//Display the data of library in reverse direction
		System.out.println("\nAll Books (Reverse):");
		lms.displayReverse();

		//Give the count of book object
		System.out.println("\nTotal Number of Books: " + lms.countBooks());

		//Search the book by title and author
		System.out.println("\nSearching for book by title '1984':");
		lms.searchByTitleOrAuthor("1984", "");

		//Update method for linkedlist
		System.out.println("\nUpdating availability for Book ID 103:");
		lms.updateAvailability(103, true);

		//Remove method to remove data by id
		System.out.println("\nRemoving Book ID 101:");
		lms.removeByBookId(101);

		//Display after removal of the book in forward direction
		System.out.println("\nAll Books (Forward) after removal:");
		lms.displayForward();
	}
}
