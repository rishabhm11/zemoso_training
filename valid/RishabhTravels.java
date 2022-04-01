package com.zemoso.solid.valid;

public class RishabhTravels implements Agency, Bus {
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
        System.out.println("This is the Bus number");
    }
}
