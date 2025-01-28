package com.librarymanagementsystem;


//Create Doubly linked list class for library management
class LibraryManagementSystem {
	private BookNode head;
	private BookNode tail;

	public LibraryManagementSystem() {
		this.head = null;
		this.tail = null;
	}

	//Create Add a new book at the beginning
	public void addAtBeginning(String title, String author, String genre, int bookId, boolean isAvailable) {
		BookNode newNode = new BookNode(title, author, genre, bookId, isAvailable);
		if (head == null) {
			head = tail = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}

	//Create Add a new book at the end
	public void addAtEnd(String title, String author, String genre, int bookId, boolean isAvailable) {
		BookNode newNode = new BookNode(title, author, genre, bookId, isAvailable);
		if (tail == null) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
	}

	//Create Add a new book at a specific position
	public void addAtPosition(int position, String title, String author, String genre, int bookId, boolean isAvailable) {
		if (position <= 0 || head == null) {
			addAtBeginning(title, author, genre, bookId, isAvailable);
			return;
		}

		BookNode newNode = new BookNode(title, author, genre, bookId, isAvailable);
		BookNode current = head;
		int index = 0;

		while (index < position - 1 && current.next != null) {
			current = current.next;
			index++;
		}

		newNode.next = current.next;
		if (current.next != null) {
			current.next.prev = newNode;
		}
		current.next = newNode;
		newNode.prev = current;

		if (newNode.next == null) {
			tail = newNode;
		}
	}

	//Create Remove a book by Book ID
	public void removeByBookId(int bookId) {
		if (head == null) {
			System.out.println("Library is empty.");
			return;
		}

		BookNode current = head;
		while (current != null && current.bookId != bookId) {
			current = current.next;
		}

		if (current == null) {
			System.out.println("Book with ID " + bookId + " not found.");
			return;
		}

		if (current.prev != null) {
			current.prev.next = current.next;
		} else {
			head = current.next;
		}

		if (current.next != null) {
			current.next.prev = current.prev;
		} else {
			tail = current.prev;
		}

		System.out.println("Book with ID " + bookId + " removed.");
	}

	//Create method Search for a book by Book Title or Author
	public void searchByTitleOrAuthor(String title, String author) {
		BookNode current = head;
		boolean found = false;
		while (current != null) {
			if (current.title.equalsIgnoreCase(title) || current.author.equalsIgnoreCase(author)) {
				System.out.println("Book Found: Title: " + current.title + ", Author: " + current.author + ", Genre: " + current.genre + ", ID: " + current.bookId + ", Available: " + current.isAvailable);
				found = true;
			}
			current = current.next;
		}
		if (!found) {
			System.out.println("No books matching the criteria found.");
		}
	}

	//Create method to Update a book's Availability Status
	public void updateAvailability(int bookId, boolean isAvailable) {
		BookNode current = head;
		while (current != null) {
			if (current.bookId == bookId) {
				current.isAvailable = isAvailable;
				System.out.println("Updated availability status for Book ID " + bookId + " to " + isAvailable);
				return;
			}
			current = current.next;
		}
		System.out.println("Book with ID " + bookId + " not found.");
	}

	//Create method to Display all books in forward order
	public void displayForward() {
		if (head == null) {
			System.out.println("Library is empty.");
			return;
		}

		BookNode current = head;
		while (current != null) {
			System.out.println("Title: " + current.title + ", Author: " + current.author + ", Genre: " + current.genre + ", ID: " + current.bookId + ", Available: " + current.isAvailable);
			current = current.next;
		}
	}

	//Create method to Display all books in reverse order
	public void displayReverse() {
		if (tail == null) {
			System.out.println("Library is empty.");
			return;
		}

		BookNode current = tail;
		while (current != null) {
			System.out.println("Title: " + current.title + ", Author: " + current.author + ", Genre: " + current.genre + ", ID: " + current.bookId + ", Available: " + current.isAvailable);
			current = current.prev;
		}
	}

	//Create method to Count the total number of books in the library
	public int countBooks() {
		int count = 0;
		BookNode current = head;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
}