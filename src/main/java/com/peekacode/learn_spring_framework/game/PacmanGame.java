package com.peekacode.learn_spring_framework.game;

public class PacmanGame implements GamingConsole{

    public void up(){
        System.out.println("Run Up");
    }

    public void down(){
        System.out.println("Run Down");
    }

    public void left(){
        System.out.println("Run Left");
    }

    public void right(){
        System.out.println("Run Right");
    }
}
