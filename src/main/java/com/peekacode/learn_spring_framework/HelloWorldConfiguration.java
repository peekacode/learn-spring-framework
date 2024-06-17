package com.peekacode.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Person( String name, int age){};
record Address( String addressLine, String city){};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Ravi";
    }

    @Bean
    public int age(){
        return 25;
    }

    @Bean
    public Person person(){
        var person = new Person("Pavan", 30);
        return person;
    }

    @Bean (name = "address2")
    public Address address(){
        var address = new Address("MBM Classic", "Bengaluru");
        return address;
    }

}
