package com.learning.factory;

public class VehicleFactory {

    public Vehicle createVehicle(String type) {
        if (type.equalsIgnoreCase("car")) {
            return new CarVehicle();
        }
        else if (type.equalsIgnoreCase("motor")) {
            return new MotorVehicle();
        }
        else {
            return null;
        }
    }

}
