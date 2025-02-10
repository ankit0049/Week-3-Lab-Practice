package com.recursiveanditerativefibonaccicomputation;

// class to recursively calculate time required for Fibonacci series
public class RecursiveFibonacci {
	public static long fibonacciRecursive(int n) {
		// Checks if the input is 0 or 1, directly returning n in such cases
		if (n <= 1) {
			return n;
		}

		// Computes Fibonacci recursively by summing previous two numbers
		return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	}

	public static long computeAndMeasure(int n) {
		// Records the start time before computation begins
		long startTime = System.nanoTime();

		// Calls the recursive Fibonacci method to compute the result
		long result = fibonacciRecursive(n);

		// Records the end time after computation finishes
		long endTime = System.nanoTime();

		// Prints the computed Fibonacci number for reference
		System.out.println("Recursive Fibonacci Result: " + result);

		// Calculates and returns the total execution time in milliseconds
		return (endTime - startTime) / 1000000;
	}
}
