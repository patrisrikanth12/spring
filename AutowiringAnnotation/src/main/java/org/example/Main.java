package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Context created...");
        Vehicle vehicle = context.getBean(Vehicle.class);
        Person person = context.getBean(Person.class);
        System.out.println("Vehicle name: " + vehicle.getName());
        System.out.println("Person name: " + person.getName());
    }
}