package com.zemoso.invalid;

public class refundpolicy2 implements cancelledAmount{
    @Override
    public void getMoney(int ticketID) {
        System.out.println("This the amount left");
    }
    @Override
    public void creditBalance() {
        System.out.println("This amount is credited to the linked AccountNumber"); }
}
