package com.zemoso.valid;

public class main {
    public static void main(String[] args) {
        refundPolicy1 rp= new refundPolicy1();
        rp.getMoney(12345);
        paymentMethod pm= new cash();
        paymentManager manager= new paymentManager(pm);
        manager.makeTransaction(600);
    }
}
