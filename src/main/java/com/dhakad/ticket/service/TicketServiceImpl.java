package com.dhakad.ticket.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhakad.ticket.entities.Ticket;
import com.dhakad.ticket.repository.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketRepository ticketRepository;

	@Override
	public Ticket createTicket(Ticket ticket) {

		return ticketRepository.save(ticket);

	}

	@Override
	public Ticket getTicketById(Integer ticketId) {

		Optional<Ticket> findById = ticketRepository.findById(ticketId);
		Ticket ticket = findById.get();
		return ticket;
	}

	@Override
	public List<Ticket> retrieveAllTickets() {

		return ticketRepository.findAll();

	}

	@Override
	public void deleteTicket(Integer ticketId) {

		ticketRepository.deleteById(ticketId);
	}

	@Override
	public Ticket updateTicket(Integer ticketId, String newEmail) {
		// TODO Auto-generated method stub
		Optional<Ticket> findById = ticketRepository.findById(ticketId);
		Ticket ticket = findById.get();
		ticket.setEmail(newEmail);
		Ticket ticket2 = ticketRepository.save(ticket);
		return ticket2;
	}

}
