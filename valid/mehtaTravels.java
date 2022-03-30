package com.zemoso.valid;
import com.zemoso.valid.agency;
import com.zemoso.valid.tempo;

public class mehtaTravels implements agency,tempo{
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
