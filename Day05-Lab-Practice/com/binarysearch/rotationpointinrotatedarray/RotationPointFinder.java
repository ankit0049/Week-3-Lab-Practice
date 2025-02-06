package com.binarysearch.rotationpointinrotatedarray;

class RotationPointFinder {

    // Method to find the index of the smallest element (rotation point) using binary search
    public static int findRotationPoint(int[] numbers) {

	   // Initializing left and right pointers
	   int left = 0;
	   int right = numbers.length - 1;

	   // Performing binary search
	   while (left < right) {

		  // Calculating the middle index
		  int mid = left + (right - left) / 2;

		  // Checking if the middle element is greater than the last element
		  if (numbers[mid] > numbers[right]) {

			 // Searching in the right half
			 left = mid + 1;
		  } else {

			 // Searching in the left half
			 right = mid;
		  }
	   }

	   // Returning the index of the rotation point
	   return left;
    }

    public static void main(String[] args) {

	   // Defining a rotated sorted array
	   int[] numbers = {6, 7, 8, 1, 2, 3, 4};

	   // Calling the function to find the rotation point
	   int result = RotationPointFinder.findRotationPoint(numbers);

	   // Printing the result
	   System.out.println(result);
    }
}
