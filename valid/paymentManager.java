package com.zemoso.valid;

import com.zemoso.valid.paymentMethod;

public class paymentManager {
    private paymentMethod pm;
    public paymentManager(paymentMethod pm){
        this.pm=pm;
    }
    public void makeTransaction(int amount){
        pm.pay(amount);
    }
}
