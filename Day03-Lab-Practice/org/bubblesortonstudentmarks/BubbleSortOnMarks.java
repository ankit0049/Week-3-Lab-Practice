package org.bubblesortonstudentmarks;

// Class to implement Bubble Sort for sorting student marks
public class BubbleSortOnMarks {

	// Method to perform Bubble Sort on an array
	public static void bubbleSortMarks(int[] marks) {
		// Gets the total number of elements in the array
		int n = marks.length;

		// Iterates through the array multiple times
		for (int i = 0; i < n - 1; i++) {
			// Tracks the swapps occur or not
			boolean swapped = false;

			// Compares adjacent elements and swaps if needed
			for (int j = 0; j < n - i - 1; j++) {
				// Checks if the current element is greater than the next element
				if (marks[j] > marks[j + 1]) {
					// Swaps the elements to place the smaller one before the larger one
					int temp = marks[j];
					marks[j] = marks[j + 1];
					marks[j + 1] = temp;

					// Marks that a swap has occurred
					swapped = true;
				}
			}

			// Breaks the loop if no swaps occurred
			if (!swapped) {
				break;
			}
		}
	}

	// Method to print the sorted array
	public static void printMarks(int[] marks) {
		// Iterates through the sorted array
		for (int mark : marks) {
			// Prints each element followed by a space
			System.out.print(mark + " ");
		}
		System.out.println();
	}


	// Class containing the main method

	public static void main(String[] args) {
		// Defines an array of student marks
		int[] marks = {45, 69, 80, 32, 77, 95};

		// Calls the sorting method to sort student marks
		BubbleSortOnMarks.bubbleSortMarks(marks);

		// Calls the method to print the sorted marks
		BubbleSortOnMarks.printMarks(marks);
	}


}
