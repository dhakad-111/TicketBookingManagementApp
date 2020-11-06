package com.dhakad.ticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dhakad.ticket.entities.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer> {

}
