package com.zemoso.valid;

public class card implements paymentMethod{
    @Override
    public void pay(int amount) {
        System.out.println("the amount has been paid using CARD");
    }
}
