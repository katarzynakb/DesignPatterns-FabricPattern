package com.driver;
import com.fabric.*;
import com.vehicle.*;

public class Driver {

    public static void main(String[] args) {
        
        VehicleFabric vehicleFabric = new VehicleFabric();
        
        Vehicle v1 = vehicleFabric.setVehicle("BICYCLE");
        v1.getColor();
        v1.getSpeed();
        v1 = vehicleFabric.setVehicle("Airplane");
        v1.getColor();
        v1.getSpeed();

        
        Vehicle v2 = vehicleFabric.setVehicle("Bus");
        v2.getColor();
        
    }

}
