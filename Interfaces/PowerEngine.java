package com.Interfaces;

public class PowerEngine implements Engine{
    @Override
    public void acc() {

        System.out.println("Power Engine accelerate");
    }

    @Override
    public void start() {
        System.out.println("Power Engine start");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine stop");
    }
}
