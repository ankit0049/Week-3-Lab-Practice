package com.moviemanagementsystem;

public class MovieList {

		// Head pointer to track the start of the list
		private MovieNode head;
		// Tail pointer to track the end of the list
		private MovieNode tail;

		// Constructor to initialize an empty movie list
		public MovieList() {
			this.head = null;
			this.tail = null;
		}

		// Method to add a movie at the beginning of the list
		public void addMovieAtBeginning(String title, String director, int yearOfRelease, double rating) {
			// Create a new movie node with the given details
			MovieNode newNode = new MovieNode(title, director, yearOfRelease, rating);
			// Check if the list is empty
			if (head == null) {
				// Set both head and tail to the new node if list is empty
				head = tail = newNode;
			} else {
				// Link the new node to the existing list
				newNode.next = head;
				// make connection for prev
				head.prev = newNode;
				// Update head to the new node
				head = newNode;
			}
		}

		// Method to add a movie at the end of the list
		public void addMovieAtEnd(String title, String director, int yearOfRelease, double rating) {
			// Create a new movie node with the given details
			MovieNode newNode = new MovieNode(title, director, yearOfRelease, rating);
			// Check if the list is empty
			if (tail == null) {
				// Set both head and tail to the new node if list is empty
				head = tail = newNode;
			} else {
				// Link the new node to the end of the list
				tail.next = newNode;
				newNode.prev = tail;
				// Update tail to the new node
				tail = newNode;
			}
		}

		// Method to add a movie at a specific position in the list
		public void addMovieAtPosition(int position, String title, String director, int yearOfRelease, double rating) {
			// Check if the position is at the beginning
			if (position <= 1) {
				addMovieAtBeginning(title, director, yearOfRelease, rating);
				return;
			}

			// Create a new movie node with the given details
			MovieNode newNode = new MovieNode(title, director, yearOfRelease, rating);
			MovieNode current = head;
			int currentPosition = 1;

			// Traverse the list to find the correct position
			while (current != null && currentPosition < position - 1) {
				current = current.next;
				currentPosition++;
			}

			// Insert the node in the desired position
			if (current != null) {
				newNode.next = current.next;
				if (current.next != null) {
					current.next.prev = newNode;
				}
				current.next = newNode;
				newNode.prev = current;

				// Update tail if new node is added at the end
				if (newNode.next == null) {
					tail = newNode;
				}
			} else {
				// Add at the end if position is out of bounds
				addMovieAtEnd(title, director, yearOfRelease, rating);
			}
		}

		// Method to remove a movie by its title
		public void removeMovieByTitle(String title) {
			MovieNode current = head;

			// Traverse the list to find the movie
			while (current != null) {
				if (current.title.equals(title)) {
					// Update pointers to remove the node
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

					// Output a success message
					System.out.println("Movie with title \"" + title + "\" removed.");
					return;
				}
				current = current.next;
			}

			// Output a failure message if the movie is not found
			System.out.println("Movie with title \"" + title + "\" not found.");
		}

		// Method to search for a movie by director or rating
		public void searchMovie(String director, double rating) {
			MovieNode current = head;
			boolean found = false;

			// Traverse the list to find matching movies
			while (current != null) {
				if (current.director.equals(director) || current.rating == rating) {
					// Output the details of the matching movie
					System.out.println("Title: " + current.title + ", Director: " + current.director +
						   ", Year: " + current.yearOfRelease + ", Rating: " + current.rating);
					found = true;
				}
				current = current.next;
			}

			// Output a failure message if no movies are found
			if (!found) {
				System.out.println("No movies found with the given criteria.");
			}
		}

		// Method to display all movies in forward order
		public void displayMoviesForward() {
			MovieNode current = head;

			// Traverse the list and output details of each movie
			while (current != null) {
				System.out.println("Title: " + current.title + ", Director: " + current.director +
					   ", Year: " + current.yearOfRelease + ", Rating: " + current.rating);
				current = current.next;
			}
		}

		// Method to display all movies in reverse order
		public void displayMoviesReverse() {
			MovieNode current = tail;

			// Traverse the list in reverse and output details of each movie
			while (current != null) {
				System.out.println("Title: " + current.title + ", Director: " + current.director +
					   ", Year: " + current.yearOfRelease + ", Rating: " + current.rating);
				current = current.prev;
			}
		}

		// Method to update the rating of a movie by its title
		public void updateMovieRating(String title, double newRating) {
			MovieNode current = head;

			// Traverse the list to find the movie
			while (current != null) {
				if (current.title.equals(title)) {
					// Update the rating of the movie
					current.rating = newRating;
					System.out.println("Rating of movie \"" + title + "\" updated to " + newRating);
					return;
				}
				current = current.next;
			}

			// Output a failure message if the movie is not found
			System.out.println("Movie with title \"" + title + "\" not found.");
		}


}
