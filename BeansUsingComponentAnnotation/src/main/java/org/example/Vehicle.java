package org.example;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
public class Vehicle {

    Vehicle() {
        System.out.println("Vehicle constructor called... ");
    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Hello!");
    }

    @PostConstruct
    public void initialize() {
        System.out.println("@PostConstruct called in Vehicle");
        this.name = "Ferrari";
    }
}
