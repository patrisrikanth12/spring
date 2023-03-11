package org.example;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // Remember, in this example, we are not placing @Component annotation to Vehicle class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Context creation completed...");

        Supplier<Vehicle> audiSupplier = () -> {
            Vehicle veh = new Vehicle();
            veh.setName("Audi");
            return veh;
        };

        Supplier<Vehicle> ferrariSupplier = () -> {
            Vehicle veh = new Vehicle();
            veh.setName("Ferrari");
            return veh;
        };

        Random random = new Random();
        int randNumber = random.nextInt();
        System.out.println("Random number is: " + randNumber);
        // if odd number, create an Audi bean.
        // otherwise, create a ferrari bean
        if(randNumber % 2 == 0) {
            context.registerBean("audi", Vehicle.class, audiSupplier);
        } else {
            context.registerBean("ferrari", Vehicle.class, ferrariSupplier);
        }

        Vehicle audiVehicle = null;
        Vehicle ferrariVehicle = null;
        try {
            audiVehicle = context.getBean("audi", Vehicle.class);
            System.out.println("Audi bean is present in the context");
        } catch( NoSuchBeanDefinitionException exception) {
            System.out.println("Audi bean doesn't exist");
        }

        try {
            ferrariVehicle = context.getBean("ferrari", Vehicle.class);
            System.out.println("Ferrari bean is present in the context");
        } catch( NoSuchBeanDefinitionException exception) {
            System.out.println("ferrari bean doesn't exist");
        }
    }
}