package com.roundrobinschedulingalgoritham;

// Class for implementing round-robin scheduling using a circular linked list
// Each node in the circular list represents a process
class RoundRobinScheduler {

	// Attribute to store the starting node of the circular linked list
	private ProcessNode head;

	// Attribute to store the last node in the circular linked list
	private ProcessNode tail;

	// Constructor to initialize the scheduler with an empty list
	public RoundRobinScheduler() {
		// Initialize head to null for an empty list
		this.head = null;
		// Initialize tail to null for an empty list
		this.tail = null;
	}

	// Method to add a new process at the end of the circular list
	public void addProcess(int processId, int burstTime, int priority) {
		// Create a new node for the process
		ProcessNode newNode = new ProcessNode(processId, burstTime, priority);

		// Check if the list is empty
		if (head == null) {
			// If empty, point head and tail to the new node
			head = tail = newNode;

			// Make the list circular by connecting tail to head
			tail.next = head;
		} else {
			// If not empty, add the new node after the current tail
			tail.next = newNode;

			// Make the new node point to the head to maintain circularity
			newNode.next = head;

			// Update the tail to the new node
			tail = newNode;
		}
	}

	// Method to remove a process from the list by Process ID
	public void removeProcess(int processId) {
		// Check if the list is empty
		if (head == null) {
			System.out.println("No processes to remove.");
			return;
		}

		// Initialize pointers for traversal
		ProcessNode current = head;
		ProcessNode prev = tail;

		// Traverse the list to find the process to remove
		do {
			if (current.processId == processId) {
				// Process found; check if it's the head node
				if (current == head) {
					// Update head to the next node
					head = head.next;
					// Update tail to maintain circularity
					tail.next = head;
				} else {
					// Update the previous node's next pointer
					prev.next = current.next;

					// Update the tail if the removed node was the tail
					if (current == tail) {
						tail = prev;
					}
				}
				System.out.println("Process " + processId + " removed.");
				return;
			}

			// Move to the next node
			prev = current;
			current = current.next;
		} while (current != head);

		// Process not found in the list
		System.out.println("Process " + processId + " not found.");
	}

	// Method to simulate the round-robin scheduling algorithm
	public void simulateScheduling(int timeQuantum) {
		// Check if there are any processes in the list
		if (head == null) {
			System.out.println("No processes to schedule.");
			return;
		}

		// Initialize pointers and variables for scheduling
		ProcessNode current = head;
		int totalProcesses = countProcesses();
		int totalWaitingTime = 0;
		int totalTurnaroundTime = 0;
		int elapsedTime = 0;

		// Continue scheduling until all processes are executed
		while (totalProcesses > 0) {
			// Check if the current process still has burst time remaining
			if (current.burstTime > 0) {
				System.out.println("Executing Process ID: " + current.processId);

				// If the process needs more time than the time quantum
				if (current.burstTime > timeQuantum) {
					// Add quantum time to elapsed time
					elapsedTime += timeQuantum;
					// Reduce process burst time
					current.burstTime -= timeQuantum;
				} else {
					// If the process can complete within the time quantum
					elapsedTime += current.burstTime;
					totalTurnaroundTime += elapsedTime;
					totalWaitingTime += elapsedTime - current.burstTime;
					current.burstTime = 0;
					removeProcess(current.processId);
					totalProcesses--;
				}
			}
			// Move to the next process in the list
			current = current.next;
		}

		// Calculate and display the average waiting and turnaround times
		double avgWaitingTime = (double) totalWaitingTime / countProcesses();
		double avgTurnaroundTime = (double) totalTurnaroundTime / countProcesses();
		System.out.println("Average Waiting Time: " + avgWaitingTime);
		System.out.println("Average Turnaround Time: " + avgTurnaroundTime);
	}

	// Method to display all processes in the circular queue
	public void displayProcesses() {
		// Check if the list is empty
		if (head == null) {
			System.out.println("No processes in the queue.");
			return;
		}

		// Traverse and print each process in the list
		ProcessNode current = head;
		do {
			System.out.println("Process ID: " + current.processId + ", Burst Time: " + current.burstTime + ", Priority: " + current.priority);
			// Move to the next process
			current = current.next;
		} while (current != head);
	}

	// Method to count the total number of processes in the queue
	private int countProcesses() {
		// Check if the list is empty
		if (head == null) {
			return 0;
		}

		// Traverse the list and count the nodes
		int count = 0;
		ProcessNode current = head;
		do {
			count++;
			// Move to the next node
			current = current.next;
		} while (current != head);

		return count;
	}
}
