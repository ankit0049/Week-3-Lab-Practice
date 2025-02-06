package com.linearsearch.firstnegetivesearch;

class FirstNegativeSearch {

    // Method to find the first negative number in an array using linear search
    public static int findFirstNegativeIndex(int[] numbers) {

	   // Iterating through the array from the beginning
	   for (int index = 0; index < numbers.length; index++) {

		  // Checking if the current element is negative
		  if (numbers[index] < 0) {

			 // Returning the index of the first negative number
			 return index;
		  }
	   }

	   // Returning -1 if no negative number is found
	   return -1;
    }

    public static void main(String[] args) {

	   // Defining a sample array
	   int[] numbers = {75, 9, 2, -3, 9, -21};

	   // Calling the function to find the first negative number's index
	   int result = FirstNegativeSearch.findFirstNegativeIndex(numbers);

	   // Printing the result
	   System.out.println(result);
    }
}
