package com.studentrecordmanagement;

// Represents a single student record in a singly linked list.
class StudentNode {
	// Create a variable named as roll number of the student
	int rollNumber;

	// Create a variable named  as name of the student
	String name;

	// Create a variable named as age
	int age;

	// Create a variable names as grade
	String grade;

	// Declares a pointer to the next node in the linked list
	StudentNode next;

	// Constructor to initialize a student node with given values
	public StudentNode(int rollNumber, String name, int age, String grade) {
		// Assigns roll number
		this.rollNumber = rollNumber;

		// Assigns name
		this.name = name;

		// Assigns age
		this.age = age;

		// Assigns grade
		this.grade = grade;

		// Initializes next pointer as null (end of list)
		this.next = null;
	}
}