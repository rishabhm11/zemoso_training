package com.zemoso.solid.valid.invalid;

public class notification {
    public void ticketDetails(int ticketID, String type){
        if(type=="mobile"){
            System.out.println("Details sent to your mobile");
            System.out.println("Details:");
            System.out.println(ticketID);
        }else if (type=="whatsapp"){
            System.out.println("Details sent to your whatsapp");
            System.out.println("Details:");
            System.out.println(ticketID);
        }
    }
    public void transaction(int ticketID, String type){
        if(type=="mobile"){
            System.out.println("Details sent to your mobile");
            System.out.println("Details:");
            System.out.println(ticketID);
        }else if (type=="whatsapp"){
            System.out.println("Details sent to your whatsapp");
            System.out.println("Details:");
            System.out.println(ticketID);
        }
    }
}
