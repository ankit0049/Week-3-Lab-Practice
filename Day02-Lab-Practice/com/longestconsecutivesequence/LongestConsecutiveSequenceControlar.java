package com.longestconsecutivesequence;

import java.util.Scanner;


public class LongestConsecutiveSequenceControlar {
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

		// Calls the method to find the longest consecutive sequence
		int result = LongestConsecutiveSequence.findLongestConsecutiveSequence(array);

		// Prints the length of the longest consecutive sequence
		System.out.println("Longest Consecutive Sequence Length: " + result);
	}
}
