package com.peekacode.learn_spring_framework;

import com.peekacode.learn_spring_framework.game.GameRunner;
import com.peekacode.learn_spring_framework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {

    public static void main(String[] args) {
        //1. Launch SpringContext
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        //2. Use the Configuration
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address2"));
        System.out.println(context.getBeanDefinitionNames());
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        //3.
    }
}
