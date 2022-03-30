package com.zemoso.valid;

public class upi implements paymentMethod{
    @Override
    public void pay(int amount) {
        System.out.println("the amount has been paid using UPI");
    }
}
