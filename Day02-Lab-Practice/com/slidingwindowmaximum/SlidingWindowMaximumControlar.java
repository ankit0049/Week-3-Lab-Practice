package com.slidingwindowmaximum;

import java.util.Scanner;


public class SlidingWindowMaximumControlar {
	public static void main(String[] args) {
		// Creating the Scanner object to get the user input
		Scanner input = new Scanner(System.in);

		// get the user input of size
		System.out.print("Enter the size of the Array :");
		int size  = input.nextInt();

		//  creating the nums array and get the user input
		int[] nums = new int[size];

		// taking the user input
		for(int i=0; i<size; i++)
		{    // get the user input for index i
			nums[i] = input.nextInt();
		}

		// Defines the window size
		System.out.print("Enter the k value :");
		int k = input.nextInt();

		// Calls the method to compute the sliding window maximum
		int[] result = SlidingWindowMaximum.findMaxSlidingWindow(nums, k);

		// Prints the computed maximum values for each window
		System.out.println("Sliding Window Maximums: ");
		for (int value : result) {
			System.out.print(value + " ");
		}
	}
}
