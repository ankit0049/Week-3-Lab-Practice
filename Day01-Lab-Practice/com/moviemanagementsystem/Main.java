package com.moviemanagementsystem;

// Main class to test the MovieManagementSystem
public class Main {
	public static void main(String[] args) {
		// Create an instance of the movie management system
		MovieList movieSystem = new MovieList();

		// Add movies to the system
		movieSystem.addMovieAtBeginning("RRR", "Raja moli", 2023, 8.6);
		movieSystem.addMovieAtEnd("The Family Man", "Raj Nidimoru and Krishna D.K", 2019, 8.7);
		movieSystem.addMovieAtPosition(2, "The Dark Knight", "Christopher Nolan", 2008, 9.0);

		// Display movies in forward order
		System.out.println("Movies in Forward Order:");
		movieSystem.displayMoviesForward();

		// Update movie rating
		movieSystem.updateMovieRating("The Dark Knight", 9.1);

		// Remove a movie by title
		movieSystem.removeMovieByTitle("The Godfather");

		// Display movies in reverse order
		System.out.println("\nMovies in Reverse Order:");
		movieSystem.displayMoviesReverse();

		// Searching the Movie via director name and rating
		System.out.println("\nMovie Search result via director name and rating :");
		movieSystem.searchMovie("Raja moli" , 8.6);
	}
}