package com.learning.simplefactory;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle car=vehicleFactory.createVehicle("car");
        Vehicle motor=vehicleFactory.createVehicle("motor");
        car.start();
        motor.start();
    }
}
