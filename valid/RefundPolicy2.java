package com.zemoso.solid.valid;

public class RefundPolicy2 implements CanceledAmount {
    @Override
    public void getMoney(int ticketID) {
        System.out.println("This the amount left and it will saved for your future transactions");
    }
}
