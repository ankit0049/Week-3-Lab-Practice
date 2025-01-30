package com.circulartourproblem;

// Class to simulate the Circular Tour Problem using a queue
class CircularTour {

	// Method to determine the starting point for completing the circular tour
	public int tour(PetrolPump[] pumps) {

		// Create a queue to simulate the circular tour
		java.util.Queue<Integer> queue = new java.util.LinkedList<>();

		// Initialize total surplus to track overall petrol balance
		int totalSurplus = 0;

		// Initialize current surplus to track balance for the current pump
		int currentSurplus = 0;

		// Iterate through all the petrol pumps
		for (int i = 0; i < pumps.length; i++) {

			// Calculate surplus petrol at the current pump (petrol - distance to next pump)
			totalSurplus += pumps[i].petrol - pumps[i].distance;

			// Add the surplus to currentSurplus (keeping track of current balance)
			currentSurplus += pumps[i].petrol - pumps[i].distance;

			// Enqueue the index of the current pump into the queue
			queue.add(i);

			// If current surplus becomes negative, remove pumps from the queue
			while (currentSurplus < 0 && !queue.isEmpty()) {

				// Remove the first pump from the queue (this is the start of the tour)
				int pumpIndex = queue.poll();

				// Update current surplus by subtracting the petrol and distance of the removed pump
				currentSurplus -= pumps[pumpIndex].petrol - pumps[pumpIndex].distance;

			}
		}

		// If total surplus is greater than or equal to 0, the circular tour is possible
		return totalSurplus >= 0 && !queue.isEmpty() ? queue.peek() : -1;
	}
}