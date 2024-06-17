package com.peekacode.learn_spring_framework;

import com.peekacode.learn_spring_framework.game.GameRunner;
import com.peekacode.learn_spring_framework.game.PacmanGame;

public class App01GamingBasicJava {

    public static void main(String[] args) {

        //var marioGame = new MarioGame();
        //var superContraGame = new SuperContraGame();
        //var gameRunner = new GameRunner(marioGame);
        var game= new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
