package com.queueusingstack;

// Class to test the QueueUsingStack implementation
class QueueUsingStackControlar {
	public static void main(String[] args) {
		// Create an instance of the queue
		QueueUsingStack queue = new QueueUsingStack();

		// Enqueue elements into the queue
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);

		// Display the entire queue
		System.out.print("Queue elements: ");
		queue.displayQueue();

		// Display the front element without removing it
		System.out.println("Front element: " + queue.peek());

		// Dequeue elements from the queue and print them
		System.out.println("Dequeued: " + queue.dequeue());
		System.out.println("Dequeued: " + queue.dequeue());

		// Display the queue after some dequeues
		System.out.print("Queue elements after dequeues: ");
		queue.displayQueue();

		// Display the front element after some dequeues
		System.out.println("Front element after dequeues: " + queue.peek());
	}
}
