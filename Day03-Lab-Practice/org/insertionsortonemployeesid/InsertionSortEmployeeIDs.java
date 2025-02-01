package org.insertionsortonemployeesid;

//  Create a Class to implement Insertion Sort for sorting employee IDs
class InsertionSortEmployeeIDs {
	// Method to perform Insertion Sort on an array
	public static void insertionSort(int[] employeeIDs) {
		// Gets the total number of elements in the array
		int n = employeeIDs.length;

		// Iterates through the array starting from the second element
		for (int i = 1; i < n; i++) {
			// Stores the current element to be inserted at the correct position
			int key = employeeIDs[i];

			// Initializes a variable to track the previous index
			int j = i - 1;

			// Shifts elements of the sorted part that are greater than the key
			while (j >= 0 && employeeIDs[j] > key) {
				// Moves the larger element one position ahead
				employeeIDs[j + 1] = employeeIDs[j];

				// Decreases the index to check the next element
				j--;
			}

			// Inserts the key at its correct position
			employeeIDs[j + 1] = key;
		}
	}

	// Method to print the sorted array
	public static void printEmployeeId(int[] employeeIDs) {
		// Iterates through the sorted array
		for (int id : employeeIDs) {
			// Prints each element followed by a space
			System.out.print(id + " ");
		}
		// Moves to the next line after printing all elements
		System.out.println();
	}


	public static void main(String[] args) {
		// Defines an array of employee IDs
		int[] employeeIDs = {104, 101, 109, 102, 107};

		// Calls the sorting method to sort employee IDs
		InsertionSortEmployeeIDs.insertionSort(employeeIDs);

		// Calls the method to print the sorted employee IDs
		InsertionSortEmployeeIDs.printEmployeeId(employeeIDs);
	}
}
