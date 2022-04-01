package com.zemoso.solid.valid;

//------------------------------------OPEN / CLOSED-----------------------------------------------------------------
//suppose we have to add feature of sending notification using mobile and whatsapp
//instead of modifying in the notification interface we will implement it
//which follows the principle of open for extension closed for modification
public class MobileNotification implements Notification {
    @Override
    public void ticketDetails(int ticketID) {
        System.out.println("Details sent to your mobile");
        System.out.println("Details:");
        System.out.println(ticketID);
    }

    @Override
    public void transaction(int ticketID) {
        System.out.println("Details sent to your mobile");
        System.out.println("Payment successful ");
        System.out.println("TRANSACTION ID");
    }
}