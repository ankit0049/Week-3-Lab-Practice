package com.taskscheduler;

public class TaskScheduler {
	public static void main(String[] args) {
		// Create an instance of the task scheduler
		TaskNodeList scheduler = new TaskNodeList();

		// Add tasks to the scheduler
		scheduler.addTaskAtBeginning(24, "Task 1", 3, "2025-02-01");
		scheduler.addTaskAtEnd(12, "Task 2", 2, "2025-02-02");
		scheduler.addTaskAtPosition(05, 3, "Task 3", 1, "2025-02-03");

		// Display all tasks
		System.out.println("All Tasks:");
		scheduler.displayAllTasks();

		// View the current task and move to the next
		System.out.println("\nViewing Current Task:");
		scheduler.viewCurrentTaskAndMoveNext();

		// Search for tasks with priority 2
		System.out.println("\nSearching for Tasks with Priority 2:");
		scheduler.searchTaskByPriority(2);

		// Remove a task by ID
		System.out.println("\nRemoving Task with ID 2:");
		scheduler.removeTaskById(2);

		// Display all tasks again
		System.out.println("\nAll Tasks After Removal:");
		scheduler.displayAllTasks();
	}
}
