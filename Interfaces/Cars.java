package com.Interfaces;

public class Cars {

    private Engine engine;
    Radio music = new MusicPlayer();
    public Cars(){
        engine = new PowerEngine();
    }

    public void changeEngine(Engine eng){
        this.engine = eng;
    }
   public void start(){

        engine.start();
   }

   public void stop(){

        engine.stop();
   }

   public void musicStart(){
        music.play();
   }

   public void musicPause(){

        music.pause();
   }

}
