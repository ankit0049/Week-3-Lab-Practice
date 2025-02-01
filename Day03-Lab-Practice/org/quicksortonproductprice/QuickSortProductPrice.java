package org.quicksortonproductprice;
// Class to implement Quick Sort for sorting product prices
class QuickSortProductPrice {
	// Method to perform Quick Sort on an array
	public static void quickSort(int[] productPrices, int low, int high) {
		// Checks if there are elements to sort
		if (low < high) {
			// Partitions the array and gets the pivot index
			int pivotIndex = pivotPartition(productPrices, low, high);

			// Recursively sorts the left part of the pivot
			quickSort(productPrices, low, pivotIndex - 1);

			// Recursively sorts the right part of the pivot
			quickSort(productPrices, pivotIndex + 1, high);
		}
	}

	// Method to partition the array around a pivot
	private static int pivotPartition(int[] productPrices, int low, int high) {
		// Selects the last element as the pivot
		int pivot = productPrices[high];

		// Index for placing elements smaller than the pivot
		int i = low - 1;

		// Iterates through the array from low to high-1
		for (int j = low; j < high; j++) {
			// Checks if the current element is smaller than the pivot
			if (productPrices[j] < pivot) {
				// Moves the index for smaller elements
				i++;

				// Swaps the current element with the element at index i
				swap(productPrices, i, j);
			}
		}

		// Places the pivot in its correct position
		swap(productPrices, i + 1, high);

		// Returns the partition index
		return i + 1;
	}

	// Method to swap two elements in an array
	private static void swap(int[] productPrices, int i, int j) {
		// Stores the first element in a temporary variable
		int temp = productPrices[i];

		// Replaces the first element with the second element
		productPrices[i] = productPrices[j];

		// Replaces the second element with the stored temporary variable
		productPrices[j] = temp;
	}

	// Method to print the sorted product prices
	public static void printProductPrice(int[] productPrices) {
		// Iterates through the sorted array
		for (int price : productPrices) {
			// Prints each element followed by a space
			System.out.print(price + " ");
		}
		// Moves to the next line after printing all elements
		System.out.println();
	}



	public static void main(String[] args) {
		// Defines an array of product prices
		int[] productPrices = {18907, 12330, 7850, 12300, 15200};

		// Calls the sorting method to sort product prices
		QuickSortProductPrice.quickSort(productPrices, 0, productPrices.length - 1);

		// Calls the method to print the sorted product prices
		QuickSortProductPrice.printProductPrice(productPrices);
	}
}
