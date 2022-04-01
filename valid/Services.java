package com.zemoso.solid.valid;

public interface Services {
    public void booking(int custID, String start, String destination);
    public void cancellation(int custID, int ticketID);
}