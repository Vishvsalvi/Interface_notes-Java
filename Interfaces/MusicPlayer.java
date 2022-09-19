package com.Interfaces;

public class MusicPlayer implements Radio {

    @Override
    public void play() {
        System.out.println("Music playing");
    }

    @Override
    public void pause() {
        System.out.println("Music paused");

    }
}
