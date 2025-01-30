package com.stockspanproblem;


import java.util.Scanner;


// Class containing the main method
class StockSpanMain {
	public static void main(String[] args) {

		// Creating the Scanner object to get the user input
		Scanner input = new Scanner(System.in);

		// get the user input of size
		System.out.print("Enter the size of the Array :");
		int size  = input.nextInt();

		// Creating the array price and get the user input
		int prices[] = new int[size];

		// taking the user input
		for(int i=0; i<size; i++)
		{    // get the user input for index i
			prices[i] = input.nextInt();
		}

		// Calls the calculateStockSpan method to get span values
		int[] span = StockSpan.calculateStockSpan(prices);

		// Prints the computed span values
		System.out.println("Stock Span for price array is: ");
		for (int value : span) {
			System.out.print(value + " ");
		}
	}
}
