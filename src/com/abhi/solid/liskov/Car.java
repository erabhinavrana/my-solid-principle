package com.abhi.solid.liskov;

/**
 * Created by Abhinav on 12/5/2018.
 */
public class Car implements NormalVehicle {

    @Override
    public void speed() {
        System.out.println("Speed the car ....");
    }

    @Override
    public void addFuel() {
        System.out.println("Adding fuel to car......");
    }
}
