package org.countingsortonstudentage;

// Class to implement Counting Sort for sorting student ages
class CountingSortStudentAges {
	// Method to perform Counting Sort on an array of ages
	public static void countingSort(int[] ages, int minAge, int maxAge) {
		// Calculates the range of ages
		int range = maxAge - minAge + 1;

		// Creates an array to store the count of each age
		int[] countArray = new int[range];

		// Creates an output array to store the sorted ages
		int[] sortedAges = new int[ages.length];

		// Iterates through the original array to count occurrences of each age
		for (int age : ages) {
			// Increments the count of the corresponding age
			countArray[age - minAge]++;
		}

		// Computes the cumulative count to determine positions in the sorted array
		for (int i = 1; i < range; i++) {
			// Updates countArray to store the position of each element
			countArray[i] += countArray[i - 1];
		}

		// Iterates through the original array in reverse order to maintain stability
		for (int i = ages.length - 1; i >= 0; i--) {
			// Finds the correct position of the current age
			int position = countArray[ages[i] - minAge] - 1;

			// Places the age at its correct position in the sorted array
			sortedAges[position] = ages[i];

			// Decrements the count to handle duplicate values correctly
			countArray[ages[i] - minAge]--;
		}

		// Copies the sorted array back to the original array
		System.arraycopy(sortedAges, 0, ages, 0, ages.length);
	}

	// Method to print the sorted ages
	public static void printStudentAges(int[] ages) {
		// Iterates through the sorted array
		for (int age : ages) {
			// Prints each element followed by a space
			System.out.print(age + " ");
		}
		// Moves to the next line after printing all elements
		System.out.println();
	}


	public static void main(String[] args) {
		// Defines an array of student ages (ranging from 10 to 18)
		int[] ages = {21, 18, 9, 18, 15, 24, 13, 26, 10, 47};

		// Defines the minimum and maximum age range
		int minAge = 9;
		int maxAge = 47;

		// Calls the sorting method to sort student ages
		CountingSortStudentAges.countingSort(ages, minAge, maxAge);

		// Calls the method to print the sorted ages
		CountingSortStudentAges.printStudentAges(ages);
	}
}
