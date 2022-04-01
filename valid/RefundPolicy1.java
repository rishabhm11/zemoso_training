package com.zemoso.solid.valid;

public class RefundPolicy1 implements CanceledAmount, Refund {
@Override
public void getMoney(int ticketID) {
        System.out.println("This the amount left");
        }
@Override
public void creditBalance() {
        System.out.println("This amount is credited to the linked AccountNumber");
        }
        }
