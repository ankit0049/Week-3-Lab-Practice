package com.onlineticketreservationsystem;

// Node class to represent a ticket reservation
class TicketNode {

	// Creates instance variable or attribute and assign the user value
	int ticketID;
	String customerName;
	String movieName;
	String seatNumber;
	String bookingTime;
	TicketNode next;

	// Constructor to initialize the TicketNode
	public TicketNode(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime) {
		this.ticketID = ticketID;
		this.customerName = customerName;
		this.movieName = movieName;
		this.seatNumber = seatNumber;
		this.bookingTime = bookingTime;
		this.next = null;
	}
}
