package com.zemoso.solid.valid;

public class PaymentManager {
    private PaymentMethod pm;
    public PaymentManager(PaymentMethod pm){
        this.pm=pm;
    }
    public void makeTransaction(int amount){
        pm.pay(amount);
    }
}
