package com.sortstackusingrecursion;

import java.util.Stack;
// Main class to test the sorting functionality
class StackSortMain {
	public static void main(String[] args) {
		// Create an instance of Stack
		Stack<Integer> stack = new Stack<>();

		// Push elements into the stack
		stack.push(9);
		stack.push(87);
		stack.push(9);
		stack.push(12);
		stack.push(96);

		// Create an instance of StackSortRecursion
		StackSortRecursion stackSort = new StackSortRecursion();

		// Display the original stack
		System.out.println("Original Stack Before sorting:");
		stackSort.displayStack(stack);
		System.out.println();

		// Sort the stack using recursion
		stackSort.sortStack(stack);

		// Display the sorted stack
		System.out.println("After sorting Sorted Stack is:");
		stackSort.displayStack(stack);
		System.out.println();
	}
}
