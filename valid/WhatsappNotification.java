package com.zemoso.solid.valid;

public class WhatsappNotification implements Notification {
    public void ticketDetails(int ticketID) {
        System.out.println("Details sent to your whatsapp");
        System.out.println("Details:");
        System.out.println(ticketID);
    }

    @Override
    public void transaction(int ticketID) {
        System.out.println("Details sent to your whatsapp");
        System.out.println("Payment successful ");
        System.out.println("TRANSACTION ID");
    }
}
