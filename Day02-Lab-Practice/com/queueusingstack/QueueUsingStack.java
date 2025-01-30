package com.queueusingstack;

import java.util.Stack;
// Class representing a queue implemented using two stacks
class QueueUsingStack {
	// Stack used for enqueue operations
	private Stack<Integer> st1;

	// Stack used for dequeue operations
	private Stack<Integer> st2;

	// Constructor to initialize the two stacks
	public QueueUsingStack() {
		st1 = new Stack<>();
		st2 = new Stack<>();
	}

	// Method to add an element to the queue
	public void enqueue(int value) {
		// Push the new element onto the enqueue stack
		st1.push(value);
	}

	// Method to remove and return an element from the front of the queue
	public int dequeue() {
		// Check if both stacks are empty (queue is empty)
		if (st1.isEmpty() && st2.isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}

		// If the dequeue stack is empty, transfer all elements from enqueue stack
		if (st2.isEmpty()) {
			while (!st1.isEmpty()) {
				st2.push(st1.pop());
			}
		}

		// Pop the top element from the dequeue stack (front of the queue)
		return st2.pop();
	}

	// Method to check if the queue is empty
	public boolean isEmpty() {
		// Returns true if both stacks are empty, otherwise false
		return st1.isEmpty() && st2.isEmpty();
	}

	// Method to return the front element of the queue without removing it
	public int peek() {
		// Check if both stacks are empty
		if (st1.isEmpty() && st2.isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}

		// Transfer elements from enqueue stack to dequeue stack if needed
		if (st2.isEmpty()) {
			while (!st1.isEmpty()) {
				st2.push(st1.pop());
			}
		}

		// Returns the top element from the dequeue stack
		return st2.peek();
	}

	// Method to display all elements in the queue
	public void displayQueue() {
		// Check if both stacks are empty
		if (st1.isEmpty() && st2.isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}

		// Create a temporary stack to hold elements in correct order
		Stack<Integer> tempStack = new Stack<>();

		// Transfer elements from dequeue stack to tempStack (preserving order)
		while (!st2.isEmpty()) {
			tempStack.push(st2.pop());
		}

		// Print elements from tempStack
		while (!tempStack.isEmpty()) {
			int value = tempStack.pop();
			System.out.print(value + " ");
			st2.push(value); // Restore elements back to dequeue stack
		}

		// Transfer elements from enqueue stack to tempStack
		Stack<Integer> tempEnqueue = new Stack<>();
		while (!st1.isEmpty()) {
			tempEnqueue.push(st1.pop());
		}

		// Print elements from tempEnqueue and restore them
		while (!tempEnqueue.isEmpty()) {
			int value = tempEnqueue.pop();
			System.out.print(value + " ");
			st1.push(value); // Restore elements back to enqueue stack
		}

		System.out.println();
	}
}