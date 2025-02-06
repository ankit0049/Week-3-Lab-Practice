package com.comparison.linearandbinarysearch;

class MissingIntegerAndBinarySearch {

    // Method to find the first missing positive integer using linear search
    public static int findFirstMissingPositive(int[] numbers) {

        // Finding the length of the array
        int length = numbers.length;

        // Creating an auxiliary array to mark presence of numbers
        boolean[] present = new boolean[length + 1];

        // Iterating through the array to mark existing numbers
        for (int number : numbers) {

            // Checking if the number is in the valid range
            if (number > 0 && number <= length) {

                // Marking the number as present
                present[number] = true;
            }
        }

        // Iterating to find the first missing positive number
        for (int index = 1; index <= length; index++) {

            // Returning the first missing number
            if (!present[index]) {
                return index;
            }
        }

        // Returning the next positive integer if all numbers are present
        return length + 1;
    }

    // Method to find the index of a target element using binary search
    public static int binarySearch(int[] numbers, int target) {

        // Initializing left and right pointers
        int left = 0;
        int right = numbers.length - 1;

        // Performing binary search
        while (left <= right) {

            // Calculating the middle index
            int mid = left + (right - left) / 2;

            // Checking if the middle element matches the target
            if (numbers[mid] == target) {
                return mid;
            } 
            // Checking if the target is smaller than the middle element
            else if (numbers[mid] > target) {
                right = mid - 1;
            } 
            // Checking if the target is larger than the middle element
            else {
                left = mid + 1;
            }
        }

        // Returning -1 if the target is not found
        return -1;
    }
}