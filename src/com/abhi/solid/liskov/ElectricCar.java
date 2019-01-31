package com.abhi.solid.liskov;

/**
 * Created by Abhinav on 12/5/2018.
 */
public class ElectricCar implements ElectricVehicle{

    @Override
    public void speed() {
        System.out.println("Speed the electric car.....");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Charging the battery of car.....");
    }
}
