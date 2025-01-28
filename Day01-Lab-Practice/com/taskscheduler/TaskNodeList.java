package com.taskscheduler;

public class TaskNodeList {

	// Head pointer to track the first node of the circular linked list
	private TaskNode head;
	// Tail pointer to track the last node of the circular linked list
	private TaskNode tail;
	// Pointer to keep track of the current task for cyclic traversal
	private TaskNode currentTask;

	// Constructor to initialize an empty circular linked list
	public TaskNodeList() {
		this.head = null;
		this.tail = null;
		this.currentTask = null;
	}

	// Method to add a task at the beginning of the list
	public void addTaskAtBeginning(int taskId, String taskName, int priority, String dueDate) {
		// Create a new task node with the given details
		TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);

		// Check if the list is empty
		if (head == null) {
			// Point both head and tail to the new node if the list is empty
			head = tail = newNode;
			// Make the list circular
			tail.next = head;
		} else {
			// Link the new node to the existing list
			newNode.next = head;
			head = newNode;
			// Update tail's next to maintain circularity
			tail.next = head;
		}

		// Update the current task pointer if necessary
		if (currentTask == null) {
			currentTask = head;
		}
	}

	// Method to add a task at the end of the list
	public void addTaskAtEnd(int taskId, String taskName, int priority, String dueDate) {
		// Create a new task node with the given details
		TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);

		// Check if the list is empty
		if (tail == null) {
			// Point both head and tail to the new node if the list is empty
			head = tail = newNode;
			// Make the list circular
			tail.next = head;
		} else {
			// Link the new node to the end of the list
			tail.next = newNode;
			// Update tail to the new node
			tail = newNode;
			// Update tail's next to maintain circularity
			tail.next = head;
		}
	}

	// Method to add a task at a specific position in the list
	public void addTaskAtPosition(int position, int taskId, String taskName, int priority, String dueDate) {
		// Check if the position is at the beginning
		if (position <= 1) {
			addTaskAtBeginning(taskId, taskName, priority, dueDate);
			return;
		}

		// Create a new task node with the given details
		TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);
		TaskNode current = head;
		int currentPosition = 1;

		// Traverse the list to find the correct position
		while (current.next != head && currentPosition < position - 1) {
			current = current.next;
			currentPosition++;
		}

		// Insert the new node at the desired position
		newNode.next = current.next;
		current.next = newNode;

		// Update tail if the new node is added at the end
		if (current == tail) {
			tail = newNode;
		}
	}

	// Method to remove a task by its ID
	public void removeTaskById(int taskId) {
		// Check if the list is empty
		if (head == null) {
			System.out.println("Task list is empty. No task to remove.");
			return;
		}

		TaskNode current = head;
		TaskNode previous = tail;

		// Traverse the list to find the task to be removed
		do {
			if (current.taskId == taskId) {
				// Update pointers to remove the node
				previous.next = current.next;

				// Update head and tail if necessary
				if (current == head) {
					head = current.next;
				}
				if (current == tail) {
					tail = previous;
				}

				// Update the current task pointer if necessary
				if (current == currentTask) {
					currentTask = current.next;
				}

				System.out.println("Task with ID " + taskId + " removed.");
				return;
			}

			previous = current;
			current = current.next;
		} while (current != head);

		// Output a message if the task is not found
		System.out.println("Task with ID " + taskId + " not found.");
	}

	// Method to view the current task and move to the next task
	public void viewCurrentTaskAndMoveNext() {
		// Check if the list is empty
		if (currentTask == null) {
			System.out.println("No tasks available.");
			return;
		}

		// Display the current task details
		System.out.println("Current Task: ID=" + currentTask.taskId + ", Name=" + currentTask.taskName +
			   ", Priority=" + currentTask.priority + ", Due Date=" + currentTask.dueDate);

		// Move to the next task in the circular list
		currentTask = currentTask.next;
	}

	// Method to display all tasks in the list
	public void displayAllTasks() {
		// Check if the list is empty
		if (head == null) {
			System.out.println("No tasks to display.");
			return;
		}

		TaskNode current = head;

		// Traverse the circular list and display each task
		do {
			System.out.println("Task: ID=" + current.taskId + ", Name=" + current.taskName +
				   ", Priority=" + current.priority + ", Due Date=" + current.dueDate);
			current = current.next;
		} while (current != head);
	}

	// Method to search for tasks by priority
	public void searchTaskByPriority(int priority) {
		// Check if the list is empty
		if (head == null) {
			System.out.println("No tasks to search.");
			return;
		}

		TaskNode current = head;
		boolean found = false;

		// Traverse the circular list to find matching tasks
		do {
			if (current.priority == priority) {
				// Display the matching task details
				System.out.println("Task: ID=" + current.taskId + ", Name=" + current.taskName +
					   ", Priority=" + current.priority + ", Due Date=" + current.dueDate);
				found = true;
			}
			current = current.next;
		} while (current != head);

		// Output a message if no matching tasks are found
		if (!found) {
			System.out.println("No tasks found with priority " + priority);
		}
	}


}
