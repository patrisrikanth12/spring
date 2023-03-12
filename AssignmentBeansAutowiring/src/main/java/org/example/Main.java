package org.example;

import org.example.beans.Person;
import org.example.speakers.Speaker;
import org.example.tyres.Tyre;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        person.setName("Joe");
        Speaker speaker = person.getVehicle().getVehicleServices().getSpeaker();
        System.out.println(speaker);
        speaker.makeSound();
        Tyre tyre = person.getVehicle().getVehicleServices().getTyre();
        System.out.println(tyre);
        tyre.rotate();
    }
}