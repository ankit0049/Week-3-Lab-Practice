package com.socialmediafreindconnections;

public class SocialNetworkManagement {


	public static void main(String[] args) {
		SocialNetwork network = new SocialNetwork();
		// Adding users to the network
		network.addUser(1, "Ankit", 24);
		network.addUser(2, "Ajeet", 12);
		network.addUser(3, "Abhishek", 05);

		// Add friend connections between users
		// Ankit and Abhishek become friends
		network.addFriendConnection(1, 2);
		network.addFriendConnection(1, 3);
		// Ankit and Ajeet become friends
		network.addFriendConnection(2, 3);

		// Display all friends of a specific user
		network.displayFriends(1);

		// Find mutual friends between two users
		System.out.println("Mutual friends of 1 and 2: " + network.findMutualFriends(1, 2));

		// Search for a user by their user ID
		network.searchUser(2);

		// Count the number of friends a user has
		System.out.println("Number of friends of 1: " + network.countFriends(1));

		// Remove a friend connection, Remove friendship between Alice and Bob
		network.removeFriendConnection(1, 2);

		System.out.println("After removing connection between 1 and 2:");
		// Display Alice's friends after removal
		network.displayFriends(1);

		System.out.println("Count Friends of ID=1 is :"+ network.countFriends(1));

	}
}
