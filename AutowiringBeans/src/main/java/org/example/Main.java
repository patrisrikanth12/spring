package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        Vehicle vehicle = context.getBean(Vehicle.class);

        System.out.println(person.getName());
        System.out.println(person.getVehicle());
        System.out.println(vehicle.getName());

        // the vehicle object and the person.getVehicle() object are same
        // that means, while autowiring the vehicle to person, new object is not created
        // instead, vehicle in the context will be used
        System.out.println(vehicle == person.getVehicle());
    }
}