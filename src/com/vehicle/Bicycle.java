package com.vehicle;

public class Bicycle implements Vehicle{

    @Override
    public void getColor() {
        System.out.println("Bicycle is red.");
        
    }

    @Override
    public void getSpeed() {
        System.out.println("Bicycle speed is 20km/h.");
        
    }

}
