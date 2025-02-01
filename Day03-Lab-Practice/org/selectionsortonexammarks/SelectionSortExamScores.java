package org.selectionsortonexammarks;

// Class to implement Selection Sort for sorting exam scores
class SelectionSortExamScores {
	// Method to perform Selection Sort on an array
	public static void selectionSort(int[] examScores) {
		// Gets the number of elements in the array
		int n = examScores.length;

		// Iterates through each element of the array
		for (int i = 0; i < n - 1; i++) {
			// Assumes the current index has the smallest element
			int minIndex = i;

			// Iterates through the unsorted part of the array
			for (int j = i + 1; j < n; j++) {
				// Checks if the current element is smaller than the assumed minimum
				if (examScores[j] < examScores[minIndex]) {
					// Updates the minimum index to the current element
					minIndex = j;
				}
			}

			// Swaps the found minimum element with the first element of the unsorted part
			swap(examScores, i, minIndex);
		}
	}

	// Method to swap two elements in an array
	private static void swap(int[] examScores, int i, int j) {
		// Stores the first element in a temporary variable
		int temp = examScores[i];

		// Replaces the first element with the second element
		examScores[i] = examScores[j];

		// Replaces the second element with the stored temporary variable
		examScores[j] = temp;
	}

	// Method to print the sorted exam scores
	public static void printExamScores(int[] examScores) {
		// Iterates through the sorted array
		for (int score : examScores) {
			// Prints each element followed by a space
			System.out.print(score + " ");
		}
		// Moves to the next line after printing all elements
		System.out.println();
	}



	public static void main(String[] args) {
		// Defines an array of exam scores
		int[] examScores = {75, 91, 76, 62, 99};

		// Calls the sorting method to sort the exam scores
		SelectionSortExamScores.selectionSort(examScores);

		// Calls the method to print the sorted exam scores
		SelectionSortExamScores.printExamScores(examScores);
	}
}
