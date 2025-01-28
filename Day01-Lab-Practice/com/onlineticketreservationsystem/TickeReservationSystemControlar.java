package com.onlineticketreservationsystem;
/* This program implements an Online Ticket Reservation System using a circular linked list.
It includes functionalities to add, remove, display, search, and calculate total booked tickets. */
public class TickeReservationSystemControlar {
	// Main method to test the system
	public static void main(String[] args) {
		TicketReservation ticketSystem = new TicketReservation();

		// Add tickets at the end of the circular linked list
		ticketSystem.addTicket(24, "Ankit Rajput", "Money Heist", "A1", "2025-01-28 10:00 AM");
		ticketSystem.addTicket(12, "Ajeet Raj pandey", "The Batman", "B2", "2025-01-28 12:00 PM");
		ticketSystem.addTicket(18, "Amit pawar", "Spider-Man: No Way Home", "C3", "2025-01-28 02:00 PM");

		// Display all tickets
		System.out.println("Displaying all tickets:");
		ticketSystem.displayTickets();

		// Search for a ticket by Customer Name or Movie Name
		System.out.println("\nSearching for tickets by 'Ankit Rajput':");
		ticketSystem.searchTicket("Ankit Rajput");

		// Remove a ticket by Ticket ID
		System.out.println("\nRemoving ticket with ID 12:");
		ticketSystem.removeTicket(12);

		// Display remaining tickets
		System.out.println("\nDisplaying remaining tickets:");
		ticketSystem.displayTickets();

		// Calculate the total number of booked tickets
		int totalTickets = ticketSystem.totalTickets();
		System.out.println("\nTotal number of booked tickets: " + totalTickets);
	}
}
