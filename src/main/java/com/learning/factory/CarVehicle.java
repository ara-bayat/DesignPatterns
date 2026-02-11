package com.learning.factory;

public class CarVehicle implements Vehicle {
    @Override
    public CarVehicle create() {
        return new CarVehicle();
    }

    @Override
    public void start() {
        System.out.println("Car Vehicle is starting");
    }
}
