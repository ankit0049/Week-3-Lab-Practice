package org.heapsortonapplicantssalary;
// Class to implement Heap Sort for sorting job applicants by salary
class HeapSortJobApplicants {
	// Method to perform Heap Sort on an array
	public static void heapSort(int[] salaries) {
		// Gets the number of elements in the array
		int n = salaries.length;

		// Builds a Max Heap from the array by heapifying from bottom to top
		for (int i = n / 2 - 1; i >= 0; i--) {
			// Calls the heapify method to adjust the subtree rooted at index i
			heapify(salaries, n, i);
		}

		// Extracts elements one by one from the heap
		for (int i = n - 1; i > 0; i--) {
			// Swaps the root (largest element) with the last element
			swap(salaries, 0, i);

			// Calls heapify on the reduced heap to maintain the heap property
			heapify(salaries, i, 0);
		}
	}

	// Method to maintain the heap property for a subtree rooted at index i
	private static void heapify(int[] salaries, int n, int i) {
		// Assumes the largest element is at the root index i
		int largest = i;

		// Finds the left child index
		int left = 2 * i + 1;

		// Finds the right child index
		int right = 2 * i + 2;

		// Checks if the left child exists and is greater than the current largest element
		if (left < n && salaries[left] > salaries[largest]) {
			// Updates the largest index to the left child
			largest = left;
		}

		// Checks if the right child exists and is greater than the current largest element
		if (right < n && salaries[right] > salaries[largest]) {
			// Updates the largest index to the right child
			largest = right;
		}

		// Checks if the largest element is not the root
		if (largest != i) {
			// Swaps the root with the largest element found
			swap(salaries, i, largest);

			// Recursively calls heapify on the affected subtree
			heapify(salaries, n, largest);
		}
	}

	// Method to swap two elements in an array
	private static void swap(int[] salaries, int i, int j) {
		// Stores the first element in a temporary variable
		int temp = salaries[i];

		// Replaces the first element with the second element
		salaries[i] = salaries[j];

		// Replaces the second element with the stored temporary variable
		salaries[j] = temp;
	}

	// Method to print the sorted salaries
	public static void printSalaries(int[] salaries) {
		// Iterates through the sorted array
		for (int salary : salaries) {
			// Prints each element followed by a space
			System.out.print(salary + " ");
		}
		// Moves to the next line after printing all elements
		System.out.println();
	}



	public static void main(String[] args) {
		// Defines an array of job applicants' salary demands
		int[] salaries = {44507, 77020, 72010, 99000, 88060};

		// Calls the sorting method to sort the salary demands
		HeapSortJobApplicants.heapSort(salaries);

		// Calls the method to print the sorted salaries
		HeapSortJobApplicants.printSalaries(salaries);
	}
}
