package com.peekacode.real_world_spring_example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class RealWorldSpringContextLauncherApp {

    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(RealWorldSpringContextLauncherApp.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBean(BusinessCalculationService.class).findMax());
        }

    }
}
