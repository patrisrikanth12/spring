package org.example;

import org.example.beans.Person;
import org.example.services.VehicleServices;
import org.example.speakers.Speaker;
import org.example.tyres.Tyre;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        VehicleServices vehicleServices  = person.getVehicle().getVehicleServices();
        vehicleServices.playMusic();
        vehicleServices.moveVehicle();
    }
}