package com.dhakad.ticket.service;

import java.util.List;

import com.dhakad.ticket.entities.Ticket;

public interface TicketService {

	Ticket createTicket(Ticket ticket);

	Ticket getTicketById(Integer ticketId);

	List<Ticket> retrieveAllTickets();

	void deleteTicket(Integer ticketId);

	Ticket updateTicket(Integer ticketId, String newEmail);

	

}
