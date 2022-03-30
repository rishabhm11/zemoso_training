package com.zemoso.valid;

import com.zemoso.valid.agency;
import com.zemoso.valid.bus;

public class rishabhTravels implements agency, bus {
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
