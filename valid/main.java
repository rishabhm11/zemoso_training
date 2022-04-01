package com.zemoso.solid.valid;

public class main {
    public static void main(String[] args) {
        //single responsibility
        ServiceDesk sd= new ServiceDesk();
        sd.booking(90,"Delhi","Dehradun");
        /*open closed principle is followed as the notification is extended to
        mobile and whatsapp notification*/
        MobileNotification mn= new MobileNotification();
        mn.ticketDetails(12345);
        //liskov substitute
        Agency rt=new RishabhTravels();
        rt.vehicleType();
        //interface segregation
        RefundPolicy1 rp= new RefundPolicy1();
        rp.getMoney(12345);
        //dependency inversion
        PaymentMethod pm= new Cash();
        PaymentManager manager= new PaymentManager(pm);
        manager.makeTransaction(600);
    }
}
