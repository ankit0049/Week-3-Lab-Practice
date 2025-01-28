package com.moviemanagementsystem;

// Define the class representing a movie node in the doubly linked list
class MovieNode {
	// Stores the title of the movie
	String title;
	// Stores the name of the director
	String director;
	// Stores the year the movie was released
	int yearOfRelease;
	// Stores the rating of the movie
	double rating;
	// Points to the next node in the list
	MovieNode next;
	// Points to the previous node in the list
	MovieNode prev;

	// Constructor to initialize the movie node with its details
	MovieNode(String title, String director, int yearOfRelease, double rating) {
		this.title = title;
		this.director = director;
		this.yearOfRelease = yearOfRelease;
		this.rating = rating;
		this.next = null;
		this.prev = null;
	}
}