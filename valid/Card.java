package com.zemoso.solid.valid;

public class Card implements PaymentMethod {
    @Override
    public void pay(int amount) {
        System.out.println("the amount has been paid using CARD");
    }
}
