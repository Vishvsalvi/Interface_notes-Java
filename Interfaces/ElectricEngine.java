package com.Interfaces;

public class ElectricEngine implements Engine{

    @Override
    public void acc() {
        System.out.println("Electric Engine accelerate");
    }

    @Override
    public void start() {
        System.out.println("Electric Engine start");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine stop");
    }
}
