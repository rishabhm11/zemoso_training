package com.zemoso.valid;

public interface services {
    public void booking(int custID, String start, String destination);
    public void cancelation(int custID, int ticketID);
}
//here services has given only one responsibility so that it has
//only reason to change
// we have not added tracking service or notification services  to it.
//we must create other interfaces to do so

