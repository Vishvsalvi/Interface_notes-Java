package com.Interfaces;

public class Main {
    public static void main(String[] args) {
        Cars myCar = new Cars();
        myCar.changeEngine(new ElectricEngine());
        myCar.start();
        myCar.musicStart();
    }
}
