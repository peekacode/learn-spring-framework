package com.peekacode.learn_spring_framework.game;

public class GameRunner {

    //MarioGame game;
    GamingConsole game;

//    public GameRunner(MarioGame game) {
//        this.game = game;
//    }

    public GameRunner(GamingConsole game) {
    this.game = game;
    }

    public void run(){
        System.out.println(" Running game: " + game);

        game.up();
        game.down();
        game.left();
        game.right();

    }
}