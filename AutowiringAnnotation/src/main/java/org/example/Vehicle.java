package org.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Vehicle {

    Vehicle() {
        System.out.println("Vehicle constructor called ... ");
    }

    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @PostConstruct
    public void init() {
        System.out.println("Vehicle @PostConstruct called");
        this.name = "Toyoto";
    }
}
