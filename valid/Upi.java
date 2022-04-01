package com.zemoso.solid.valid;

public class Upi implements PaymentMethod {
    @Override
    public void pay(int amount) {
        System.out.println("the amount has been paid using UPI");
    }
}
