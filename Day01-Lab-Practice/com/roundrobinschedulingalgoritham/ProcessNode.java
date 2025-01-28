package com.roundrobinschedulingalgoritham;

// Class representing a process in the round-robin scheduler
class ProcessNode {

	// Stores the unique ID of the process
	int processId;

	// Stores the time required to execute the process
	int burstTime;

	// Represents the priority of the process
	int priority;

	// Points to the next process in the circular linked list
	ProcessNode next;

	// Constructor to initialize a process with its ID, burst time, and priority
	public ProcessNode(int processId, int burstTime, int priority) {
		this.processId = processId;
		this.burstTime = burstTime;
		this.priority = priority;
		this.next = null;
	}
}
