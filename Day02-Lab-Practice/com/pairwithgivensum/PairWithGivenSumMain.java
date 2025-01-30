package com.pairwithgivensum;

import java.util.Scanner;
// Class containing the main method
class PairWithGivenSumMain {
	public static void main(String[] args) {
		// Creating the Scanner object to get the user input
		Scanner input = new Scanner(System.in);

		// get the user input of size
		System.out.print("Enter the size of the Array :");
		int size  = input.nextInt();

		// Creating the array price and get the user input
		int array[] = new int[size];

		// taking the user input
		for(int i=0; i<size; i++)
		{    // get the user input for index i
			array[i] = input.nextInt();
		}

		// Defines the target sum to search for
		int targetSum = 9;

		// Calls the method to check if a pair exists with the given sum
		PairWithGivenSum.hasPairWithSum(array, targetSum);
	}
}
