package com.vehicle;

public class Bus implements Vehicle{

    @Override
    public void getColor() {
        System.out.println("Bus is blue.");
        
    }

    @Override
    public void getSpeed() {
        System.out.println("Bus speed is 80km/h.");
        
    }

}
