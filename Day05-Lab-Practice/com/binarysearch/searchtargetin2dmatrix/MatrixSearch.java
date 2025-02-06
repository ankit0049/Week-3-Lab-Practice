package com.binarysearch.searchtargetin2dmatrix;

class MatrixSearch {

    // Method to search for a target value in a sorted 2D matrix using binary search
    public static boolean searchMatrix(int[][] matrix, int target) {

        // Getting the number of rows and columns
        int rows = matrix.length;
        int columns = matrix[0].length;

        // Initializing left and right pointers
        int left = 0;
        int right = rows * columns - 1;

        // Performing binary search
        while (left <= right) {

            // Calculating the middle index
            int mid = left + (right - left) / 2;

            // Finding the row and column indices of the middle element
            int row = mid / columns;
            int col = mid % columns;

            // Checking if the middle element matches the target
            if (matrix[row][col] == target) {
                return true;
            }

            // Checking if the target is smaller than the middle element
            if (matrix[row][col] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        // Returning false if the target is not found
        return false;
    }

    public static void main(String[] args) {

        // Defining a sorted 2D matrix
        int[][] matrix = {
            {1, 3, 5},
            {7, 10, 12},
            {14, 16, 18}
        };

        // Defining the target value
        int target = 10;

        // Calling the function to search for the target in the matrix
        boolean result = MatrixSearch.searchMatrix(matrix, target);

        // Printing the result
        System.out.println(result);
    }
}
