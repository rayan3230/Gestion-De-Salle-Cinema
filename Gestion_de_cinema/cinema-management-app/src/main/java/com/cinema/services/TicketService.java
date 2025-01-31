package com.cinema.services;

import com.cinema.models.Ticket;
import com.cinema.models.Screening;

import java.util.ArrayList;
import java.util.List;

public class TicketService {
    private List<Ticket> tickets;

    public TicketService() {
        this.tickets = new ArrayList<>();
    }

    public Ticket bookTicket(Screening screening, double price) {
        Ticket ticket = new Ticket(tickets.size() + 1, price, screening);
        tickets.add(ticket);
        return ticket;
    }

    public List<Ticket> getAllTickets() {
        return tickets;
    }

    public Ticket getTicketById(int ticketId) {
        return tickets.stream()
                .filter(ticket -> ticket.getTicketNumber() == ticketId)
                .findFirst()
                .orElse(null);
    }
}