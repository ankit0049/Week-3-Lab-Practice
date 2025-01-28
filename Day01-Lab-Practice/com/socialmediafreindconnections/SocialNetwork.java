package com.socialmediafreindconnections;

import java.util.ArrayList;
import java.util.List;


// Represents the entire social network, which is a linked list of users
class SocialNetwork {
	// Head of the singly linked list representing the network
	public Node head;

	// Constructor to initialize an empty social network
	public SocialNetwork() {
		head = null;
	}

	// Adds a new user to the beginning of the linked list
	public void addUser(int userId, String name, int age) {
		// Create a new user node
		Node newNode = new Node(userId, name, age);
		// Point the new user's next to the current head
		newNode.next = head;
		// Update the head to the new user
		head = newNode;
	}

	// Adds a bidirectional friend connection between two users
	public void addFriendConnection(int userId1, int userId2) {
		Node current = head;
		// Traverse the list to find the users and add friend connections
		while (current != null) {
			if (current.userId == userId1) {
				// Add user2 as a friend of user1
				current.friendIds.add(userId2);
			} else if (current.userId == userId2) {
				// Add user1 as a friend of user2
				current.friendIds.add(userId1);
			}
			current = current.next;
		}
	}

	// Removes a bidirectional friend connection between two users
	public void removeFriendConnection(int userId1, int userId2) {
		Node current = head;
		// Traverse the list and remove the friend connections for both users
		while (current != null) {
			if (current.userId == userId1) {
				// Remove user2 from user1's friend list
				current.friendIds.remove(Integer.valueOf(userId2));
			} else if (current.userId == userId2) {
				// Remove user1 from user2's friend list
				current.friendIds.remove(Integer.valueOf(userId1));
			}
			current = current.next;
		}
	}

	// Finds mutual friends between two users
	public List<Integer> findMutualFriends(int userId1, int userId2) {
		// Find both users in the list
		Node user1 = findUser(userId1);
		Node user2 = findUser(userId2);

		// If either user doesn't exist, return an empty list of mutual friends
		if (user1 == null || user2 == null) {
			return new ArrayList<>();
		}

		List<Integer> mutualFriends = new ArrayList<>();
		// Compare the friend lists of both users to find mutual friends
		for (int friendId : user1.friendIds) {
			if (user2.friendIds.contains(friendId)) {
				// Add mutual friend ID to the list
				mutualFriends.add(friendId);
			}
		}
		return mutualFriends;
	}

	// Displays all friends of a specific user
	public void displayFriends(int userId) {
		// Find the user by their ID
		Node user = findUser(userId);
		if (user == null) {
			System.out.println("User not found.");
			return;
		}

		// Display the friends of the user
		System.out.println("Friends of " + user.name + " (" + user.userId + "):");
		for (int friendId : user.friendIds) {
			System.out.println(" - User ID: " + friendId);
		}
	}

	// Searches for a user by their userId
	public void searchUser(int userId) {
		Node current = head;
		while (current != null) {
			if (current.userId == userId) {
				// Print user details when found
				System.out.println("User Found: " + current.name + " (User ID: " + current.userId + ")");
				return;
			}
			current = current.next;
		}
		// Print message if user not found
		System.out.println("User not found.");
	}

	// Counts the number of friends of a specific user
	public int countFriends(int userId) {
		// Find the user by ID
		Node user = findUser(userId);
		if (user == null) {
			return 0;
		}
		// Return the number of friends (size of the friend list)
		return user.friendIds.size();
	}

	// Helper method to find a user node by their userId
	private Node findUser(int userId) {
		Node current = head;
		while (current != null) {
			if (current.userId == userId) {
				// Return the user node if found
				return current;
			}
			current = current.next;
		}
		return null; // Return null if the user is not found
	}

}
