package com.socialmediafreindconnections;
import java.util.ArrayList;
import java.util.List;
// Represents a node (user) in the linked list
public class Node {

	// Create attribute name userId name and age and get the user value
	int userId;
	String name;
	int age;
	// List of friend IDs representing friends of the user
	List<Integer> friendIds;
	// Reference to the next user in the linked list
	Node next;

	// Constructor to initialize a new user
	public Node(int userId, String name, int age) {
		this.userId = userId;
		this.name = name;
		this.age = age;
		this.friendIds = new ArrayList<>();
		this.next = null;
	}
}
