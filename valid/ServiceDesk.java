package com.zemoso.solid.valid;

public class ServiceDesk implements Services, Tracking{

    @Override
    public void booking(int custID, String start, String destination) {
        System.out.println("TICKET BOOKED");
    }

    @Override
    public void cancellation(int custID, int ticketID) {
        System.out.println("TICKET cancelled");
    }

    @Override
    public void track(int ticketID) {
        System.out.println("TRACKED");
    }
}
