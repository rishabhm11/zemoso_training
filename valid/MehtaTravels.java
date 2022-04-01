package com.zemoso.solid.valid;

public class MehtaTravels implements Agency, Tempo {
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
        System.out.println("This is the Tempo number");
    }
}
