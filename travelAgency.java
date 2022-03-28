package com.zemoso;

interface services {
    public void booking(int custID, String start, String destination);
    public void cancelation(int custID, int ticketID);
}
//here services has given only one responsibility so that it has
//only reason to change
// we have not added tracking service or notification services  to it.
//we must create other interfaces to do so
interface tracking{
    public void track(int ticketID);
}
interface notification{
    public void ticketDetails(int ticketID);
    public void transaction(int ticketID);
}
//------------------------------------OPEN / CLOSED-----------------------------------------------------------------
//suppose we have to add feature of sending notification using mobile and whatsapp
//instead of modifying in the notification interface we will implement it
//which follows the principle of open for extension closed for modification
class MobileNotification implements notification {
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
class WhatsappNotification implements notification {
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
//-------------------------------------------------------------------------------------------------------

//-----------------------------LISKOV SUBSTITUTION-------------------------------------------------------
interface agency {
    public void Driver();
    public void vehicleType();
}
interface bus {
    public void busNo();
}
interface tempo {
    public void tempoNo();
}
class rishabhTravels implements agency,bus {
    @Override
    public void Driver() {
        System.out.println("This is the driver's name");
    }
    @Override
    public void vehicleType() {
        System.out.println("This is the vehicle type");
    }
    @Override
    public void busNo() {
        System.out.println("This is the bus number");
    }
}
class mehtaTravels implements agency,tempo{
    @Override
    public void Driver() {
        System.out.println("This is the driver's name");
    }
    @Override
    public void vehicleType() {
        System.out.println("This is the vehicle type");
    }
    @Override
    public void tempoNo() {
        System.out.println("This is the tempo number");
    }
}
// here substition is possible because it doesn't disturb the behaviour ofd the program
//---------------------------------------------------------------------------------------------

//-----------------------INTERFACE SEGREGATION-------------------------------------------------
interface canceledAmount{
    public void getMoney(int ticketID);
}
interface refund{
    public void creditBalance();
}
class refundpolicy1 implements canceledAmount,refund{
    @Override
    public void getMoney(int ticketID) {
        System.out.println("This the amount left");
    }
    @Override
    public void creditBalance() {
        System.out.println("This amount is credited to the linked AccountNumber");
    }
}
class refundpolicy2 implements canceledAmount{
    @Override
    public void getMoney(int ticketID) {
        System.out.println("This the amount left and it will saved for your future transactions");
    }
}
// we have implemented different interfaces for different task
// therefore it will not create compulsion to any class to implement all of the properties
//----------------------------------------------------------------------------------------------

//------------------------Dependency Inversion -------------------------------------------------
interface paymentMethod{
    public void pay(int amount);
}
class cash implements paymentMethod{
    @Override
    public void pay(int amount) {
        System.out.println("the amount has been paid using CASH");
    }
}
class upi implements paymentMethod{
    @Override
    public void pay(int amount) {
        System.out.println("the amount has been paid using UPI");
    }
}
class card implements paymentMethod{
    @Override
    public void pay(int amount) {
        System.out.println("the amount has been paid using CARD");
    }
}
class paymentManager{
    private paymentMethod pm;
    public paymentManager(paymentMethod pm){
        this.pm=pm;
    }
    public void makeTransaction(int amount){
        pm.pay(amount);
    }
}
//instead of tightly coupling cash,upi and cards we use paymentMethod which is implemented by
//all methods ,i.e, cash, upi and cards
//-------------------------------------------------------------------------------------------
public class travelAgency {
    public static void main(String[] args) {
        refundpolicy1 rp= new refundpolicy1();
        rp.getMoney(12345);
        paymentMethod pm= new cash();
        paymentManager manager= new paymentManager(pm);
        manager.makeTransaction(600);
    }
}
