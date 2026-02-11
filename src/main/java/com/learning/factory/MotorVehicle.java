package com.learning.factory;

public class MotorVehicle implements Vehicle {
    @Override
    public MotorVehicle create() {
        return new MotorVehicle();
    }

    @Override
    public void start() {
        System.out.println("Motor Vehicle is starting");
    }

}
