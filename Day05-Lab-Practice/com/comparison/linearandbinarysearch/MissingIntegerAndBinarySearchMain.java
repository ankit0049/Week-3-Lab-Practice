package com.comparison.linearandbinarysearch;

import java.util.Arrays;


// Main class to test the function
public class MissingIntegerAndBinarySearchMain {
    public static void main(String[] args) {

        // Defining an array of integers
        int[] numbers = {34, 4, 71, -11 , 89};

        // Finding the first missing positive integer using linear search
        int missingNumber = MissingIntegerAndBinarySearch.findFirstMissingPositive(numbers);

        // Sorting the array before applying binary search
        Arrays.sort(numbers);

        // Defining the target element
        int target = -11;

        // Finding the index of the target element using binary search
        int targetIndex = MissingIntegerAndBinarySearch.binarySearch(numbers, target);

        // Printing the missing number and target index
        System.out.println(missingNumber + " " + targetIndex);
    }
}
