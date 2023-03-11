package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Context creation completed");
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println(vehicle.getName());
        vehicle.printHello();
    }
}
