package com.deyvidsalvatore.results.result04;

public class TicketMachine {

    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        ticket.setDestination("New York");

        ticket.setPrice(15.30);

        ticket.setReturn(true);

        System.out.println(ticket.getDestination());

        System.out.println(ticket.getPrice());

        System.out.println(ticket.isReturn());
    }
}
