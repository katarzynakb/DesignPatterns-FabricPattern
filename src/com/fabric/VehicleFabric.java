package com.fabric;
import com.vehicle.*;

public class VehicleFabric {
    public Vehicle setVehicle(String name) {
        
        if(name.equalsIgnoreCase("Bicycle")) {
            
            return new Bicycle();
        }
        else if(name.equalsIgnoreCase("Bus")) {
            
            return new Bus();
        }
        else if(name.equalsIgnoreCase("Airplane")) {
            
            return new Airplane();
        }
        return null;
    }
}
