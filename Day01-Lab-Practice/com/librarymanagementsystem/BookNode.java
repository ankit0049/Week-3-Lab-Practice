package com.librarymanagementsystem;

//Create Node class representing a book in the library
class BookNode {
	//Create attributes of the BookNode class
	String title;
	String author;
	String genre;
	int bookId;
	boolean isAvailable;
	BookNode next;
	BookNode prev;

	//Create constructor to set the value of global var
	public BookNode(String title, String author, String genre, int bookId, boolean isAvailable) {
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.bookId = bookId;
		this.isAvailable = isAvailable;
		this.next = null;
		this.prev = null;
	}
}