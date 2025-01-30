package com.sortstackusingrecursion;

import java.util.Stack;

// Class to implement stack sorting using recursion
class StackSortRecursion {

	// Method to sort a stack using recursion
	public void sortStack(Stack<Integer> stack) {
		// Base case: If stack is empty, return
		if (stack.isEmpty()) {
			return;
		}

		// Remove the top element of the stack
		int topElement = stack.pop();

		// Recursively sort the remaining stack
		sortStack(stack);

		// Insert the removed element back at the correct position
		insertSortedStack(stack, topElement);
	}

	// Method to insert an element into a sorted stack
	private void insertSortedStack(Stack<Integer> stack, int element) {
		// Base case: If stack is empty or top element is smaller, push the element
		if (stack.isEmpty() || stack.peek() <= element) {
			stack.push(element);
			return;
		}

		// Remove the top element
		int topElement = stack.pop();

		// Recursively insert the element in the sorted stack
		insertSortedStack(stack, element);

		// Push the removed element back on top
		stack.push(topElement);
	}

	// Method to display the elements of the stack
	public void displayStack(Stack<Integer> stack) {
		// Base case: If stack is empty, return
		if (stack.isEmpty()) {
			return;
		}

		// Remove the top element
		int topElement = stack.pop();

		// Display the removed element
		System.out.print(topElement + " ");

		// Recursively display the remaining stack
		displayStack(stack);

		// Push the removed element back (to retain original stack)
		stack.push(topElement);
	}
}
