package com.zemoso;

class services {
    public void booking(int custID, String start, String destination){

    };
    public void cancelation(int custID, int ticketID){

    };
    public void track(int ticketID){

    };
}
//here services has given multiple responsibilities so
//it violates the single responsibility principle
//------------------------------------------------------------------------
class notification{
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
//here if we have to add new feature in notification services we
// have to make change in class itself
// therefore open close principle is violated
//--------------------------------------------------------------------------------
class agency {
    public void Driver(){

    }
    public void vehicleType(){

    }
    public void busNo(){

    }
    public void tempoNo(){

    }
}
class rishabhTravels extends agency{
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
//    @Override
//    public void tempoNo() {
//        System.out.println("This is the tempo number");
//    }
}
// we have implemented agency to rishabhtravels therefore all of the functions
// got implemented there but rishabhtravels dont have tempo service
// thus it cannot substitutes the agency class
// therefore, it violates liskov substitution principle
//------------------------------------------------------------------------------

interface canceledAmount{
    public void getMoney(int ticketID);
    public void creditBalance();
}
class refundpolicy2 implements canceledAmount{
    @Override
    public void getMoney(int ticketID) {
        System.out.println("This the amount left");
    }
    @Override
    public void creditBalance() {
        System.out.println("This amount is credited to the linked AccountNumber");
    }
}
// here the interfaces are not segregated
// therefore the class refundpolicy2 have to compulsory implement the interface
// canceledamount
// which violated the interface segregation principle
//----------------------------------------------------------------------------------------------

class cash {
    public void pay(int amount) {
        System.out.println("the amount has been paid using CASH");
    }
}
class upi {
    public void pay(int amount) {
        System.out.println("the amount has been paid using UPI");
    }
}
class paymentManager{
    private cash cash;
    public paymentManager(paymentMethod cash){
        this.cash=cash;
    }
    public void makeTransaction(int amount){
        cash.pay(amount);
    }
}
// here we have hard coded the class cash in the paymentmanager class
// therefore we have to make changes in paymentmanagaer class
//for changing the payment method which will violate oopen close principle
//  these are highly coupled classes
// therefore it violated the dependency inversion principle
//--------------------------------------------------------------------------
public class invalidTravelAgency {
    //this code violates all the solid principles
}
