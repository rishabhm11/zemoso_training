package com.zemoso.invalid;

public class paymentManager {
    private cash cash;
    public paymentManager(cash cash){
        this.cash=cash;
    }
    public void makeTransaction(int amount){
        cash.pay(amount);
    }
}
