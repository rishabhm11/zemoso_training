package com.zemoso.valid;
import com.zemoso.valid.notification;

public class whatsappNotification implements com.zemoso.valid.notification {
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
