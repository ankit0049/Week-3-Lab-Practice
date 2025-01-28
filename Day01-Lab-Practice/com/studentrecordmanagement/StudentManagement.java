package com.studentrecordmanagement;

public class StudentManagement {
	public static void main(String[] args) {
		// Creates an instance of StudentRecordList
		StudentRecordList studentList = new StudentRecordList();

		// Adds student records with default values
		studentList.addAtEnd(24, "Ankit Rajput", 21, "A");
		studentList.addAtEnd(12, "Ajeet", 21, "A+");
		studentList.addAtEnd(84, "Vinay Jaduan", 22, "A");

		// Displays initial student records
		System.out.println("Initial Student Records:");
		studentList.displayRecords();

		// Adds a student at the beginning
		studentList.addAtBeginning(28, "Rehani", 17, "A+");

		// Displays student records after insertion
		System.out.println("\nStudent Records after Insertion:");
		studentList.displayRecords();

		// Updates a student's grade
		studentList.updateGrade(72, "B");

		// Displays student records after update
		System.out.println("\nStudent Records after Grade Update:");
		studentList.displayRecords();

		// Deletes a student by roll number
		studentList.deleteByRollNumber(84);

		// Displays student records after deletion
		System.out.println("\nStudent Records after Deletion:");
		studentList.displayRecords();
	}
}
