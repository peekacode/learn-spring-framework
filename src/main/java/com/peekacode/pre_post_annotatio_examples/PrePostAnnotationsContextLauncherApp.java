package com.peekacode.pre_post_annotatio_examples;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass{

    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        super();
        this.someDependency = someDependency;
        System.out.println("All dependencies are ready");
    }

    void initialize(){
        someDependency.getReady();
    }
}

@Component
class SomeDependency{

    @PostConstruct
    public void getReady() {
        System.out.println("Some logic in SomeDependency");
    }

    @PreDestroy
    public void cleanup(){
        System.out.println("Cleanup");
    }
}

@Configuration
@ComponentScan
public class PrePostAnnotationsContextLauncherApp {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncherApp.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
