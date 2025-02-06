package com.binarysearch.peakelementinarray;

class PeakElementFinder {

    // Method to find a peak element using binary search
    public static int findPeakElement(int[] numbers) {

	   // Initializing left and right pointers
	   int left = 0;
	   int right = numbers.length - 1;

	   // Performing binary search
	   while (left < right) {

		  // Calculating the middle index
		  int mid = left + (right - left) / 2;

		  // Checking if the middle element is greater than the next element
		  if (numbers[mid] > numbers[mid + 1]) {

			 // Searching in the left half
			 right = mid;
		  } else {

			 // Searching in the right half
			 left = mid + 1;
		  }
	   }

	   // Returning the peak element
	   return numbers[left];
    }

    public static void main(String[] args) {

	   // Defining an array
	   int[] numbers = {11, 13, 17, 81, 44, 12};

	   // Calling the function to find a peak element
	   int result = PeakElementFinder.findPeakElement(numbers);

	   // Printing the result
	   System.out.println(result);
    }
}
