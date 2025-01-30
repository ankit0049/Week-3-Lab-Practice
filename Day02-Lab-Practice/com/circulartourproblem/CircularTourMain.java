package com.circulartourproblem;

// Class to test the CircularTour implementation
class CircularTourMain {
	public static void main(String[] args) {
		// Create an array of PetrolPump objects representing each petrol pump with petrol and distance
		PetrolPump[] pumps = {
			   new PetrolPump(4, 6),
			   new PetrolPump(6, 5),
			   new PetrolPump(7, 3),
			   new PetrolPump(4, 5)
		};

		// Create an instance of CircularTour to run the solution
		CircularTour solution = new CircularTour();

		// Call the tour method to determine the starting point of the circular tour
		int result = solution.tour(pumps);

		// Check if the result is valid (starting index) or -1 (no valid tour)
		if (result == -1) {

			// If result is -1, print that no solution is possible
			System.out.println("No solution, tour is not possible.");
		} else {

			// If result is a valid index, print the starting point for the circular tour
			System.out.println("Starting point for the circular tour: Pump " + result);
		}
	}
}