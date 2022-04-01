package com.zemoso.solid.valid;

public class Cash implements PaymentMethod {
    @Override
    public void pay(int amount) {
        System.out.println("the amount has been paid using CASH");
    }
}
