package com.vehicle;

public class Airplane implements Vehicle {

    @Override
    public void getColor() {
        System.out.println("Airplane is white.");
        
    }

    @Override
    public void getSpeed() {
        System.out.println("Airplane speed is 400km/h.");
        
    }

}
