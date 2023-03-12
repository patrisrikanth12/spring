package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Person {

    Person() {
        System.out.println("Person constructor is called");
        System.out.println("When Person constructor is called, tha value of this.vehicle is " + this.vehicle);
    }

    String name;

    // Spring is smart enough to identify the dependency
    // i.e. Person is dependent on Vehicle
    // Here, vehicle is the dependency
    // Spring searches for the dependency in the Context
    // It exists, the dependency will be injected into Person
    // If it doesn't exist, exception will be raised saying that dependency not found
    // to avoid the above exception and make the dependency optional, use required = false
    @Autowired(required = false)
    Vehicle vehicle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @PostConstruct
    public void init() {
        System.out.println("Person @PostConstruct called");
        System.out.println("When Person @PostConstruct is called, tha value of this.vehicle is " + this.vehicle);
        this.name = "John";
    }
}
