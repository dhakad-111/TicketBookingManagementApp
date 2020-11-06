package com.dhakad.ticket.entities.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dhakad.ticket.entities.Ticket;
import com.dhakad.ticket.service.TicketService;

@RestController
@RequestMapping(value = "api/tickets")
public class TicketController {

	@Autowired
	private TicketService ticketService;

	@PostMapping(value = "/create")
	public Ticket createTicket(@RequestBody Ticket ticket) {
		return ticketService.createTicket(ticket);
	}

	@GetMapping("/ticket/{ticketId}")
	public Ticket getTicketById(@PathVariable("ticketId") Integer ticketId) {
		return ticketService.getTicketById(ticketId);
	}

	@GetMapping("/ticket/alltickets")
	public List<Ticket> retrieveAllTickets() {
		return ticketService.retrieveAllTickets();
	}

	@DeleteMapping("/ticket/{ticketId}")
	public void deleteTicket(@PathVariable("ticketId") Integer ticketId) {
		ticketService.deleteTicket(ticketId);
	}

	@PutMapping("/ticket/{ticketId}/{newEmail:.+}")
	public Ticket updateTicket(@PathVariable("ticketId") Integer ticketId,@PathVariable("newEmail") String newEmail) {
		
	  return ticketService.updateTicket(ticketId, newEmail);
	}

}
