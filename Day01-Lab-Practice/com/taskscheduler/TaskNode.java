package com.taskscheduler;

// Class to represent a single node in the circular linked list
class TaskNode {
	// Stores the unique ID of the task
	int taskId;
	// Stores the name of the task
	String taskName;
	// Stores the priority of the task
	int priority;
	// Stores the due date of the task
	String dueDate;
	// Points to the next node in the circular linked list
	TaskNode next;

	// Constructor to initialize the task node with its details
	TaskNode(int taskId, String taskName, int priority, String dueDate) {
		this.taskId = taskId;
		this.taskName = taskName;
		this.priority = priority;
		this.dueDate = dueDate;
		this.next = null;
	}
}