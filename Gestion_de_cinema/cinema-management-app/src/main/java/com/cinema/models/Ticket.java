package com.cinema.models;

public class Ticket {
    private String ticketNumber;
    private double price;
    private Screening screening;

    public Ticket(String ticketNumber, double price, Screening screening) {
        this.ticketNumber = ticketNumber;
        this.price = price;
        this.screening = screening;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Screening getScreening() {
        return screening;
    }

    public void setScreening(Screening screening) {
        this.screening = screening;
    }
}