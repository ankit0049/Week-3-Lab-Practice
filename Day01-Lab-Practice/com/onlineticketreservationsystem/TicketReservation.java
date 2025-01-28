package com.onlineticketreservationsystem;

// CircularLinkedList class to represent the entire ticket reservation system
class TicketReservation {
	TicketNode head = null;
	TicketNode tail = null;

	// Method to add a new ticket reservation at the end of the circular list
	public void addTicket(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime) {
		TicketNode newTicket = new TicketNode(ticketID, customerName, movieName, seatNumber, bookingTime);

		if (head == null) {
			head = newTicket;
			tail = newTicket;
			// Maintain the circular link
			tail.next = head;
		} else {
			tail.next = newTicket;
			tail = newTicket;
			// Maintain the circular link
			tail.next = head;
		}
	}

	// Method to remove a ticket by Ticket ID
	public void removeTicket(int ticketID) {
		if (head == null) {
			System.out.println("No tickets available.");
			return;
		}

		TicketNode temp = head;
		TicketNode prev = null;

		// If head node itself holds the ticket to be removed
		if (temp.ticketID == ticketID) {
			if (head == tail) {
				// List becomes empty
				head = tail = null;
			} else {
				// Move head to the next node
				head = head.next;
				// Maintain the circular link
				tail.next = head;
			}
			System.out.println("Ticket with ID " + ticketID + " removed.");
			return;
		}

		// Search for the ticket to be removed
		do {
			prev = temp;
			temp = temp.next;
		} while (temp != head && temp.ticketID != ticketID);

		// If ticket was not found
		if (temp == head) {
			System.out.println("Ticket with ID " + ticketID + " not found.");
		} else {
			// Bypass the node to remove it
			prev.next = temp.next;
			if (temp == tail) {
				// If it was the last node, update tail
				tail = prev;
			}
			System.out.println("Ticket with ID " + ticketID + " removed.");
		}
	}

	// Method to display the current tickets in the list
	public void displayTickets() {
		if (head == null) {
			System.out.println("No tickets to display.");
			return;
		}

		TicketNode temp = head;
		do {
			System.out.println("Ticket ID: " + temp.ticketID + ", Customer Name: " + temp.customerName +
				   ", Movie Name: " + temp.movieName + ", Seat Number: " + temp.seatNumber +
				   ", Booking Time: " + temp.bookingTime);
			temp = temp.next;
		} while (temp != head);
	}

	// Method to search for a ticket by Customer Name or Movie Name
	public void searchTicket(String searchString) {
		if (head == null) {
			System.out.println("No tickets available.");
			return;
		}

		TicketNode temp = head;
		boolean found = false;

		do {
			if (temp.customerName.equalsIgnoreCase(searchString) || temp.movieName.equalsIgnoreCase(searchString)) {
				System.out.println("Ticket ID: " + temp.ticketID + ", Customer Name: " + temp.customerName +
					   ", Movie Name: " + temp.movieName + ", Seat Number: " + temp.seatNumber +
					   ", Booking Time: " + temp.bookingTime);
				found = true;
			}
			temp = temp.next;
		} while (temp != head);

		if (!found) {
			System.out.println("No tickets found for the given search string.");
		}
	}

	// Method to calculate the total number of booked tickets
	public int totalTickets() {
		if (head == null) {
			return 0;
		}

		int count = 0;
		// Create a temp refernce for traversing
		TicketNode temp = head;
		do {
			count++;
			temp = temp.next;
		} while (temp != head);

		// return the total result count
		return count;
	}
}