package org.example;

import org.example.beans.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        // IoC container
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Context creation completed");

        // Display all the beans present in the context
        System.out.println("==================================");
        System.out.println("Beans present in the context are: ");
        String[] beanNames = context.getBeanNamesForType(Vehicle.class);
        for(String beanName: beanNames) {
            System.out.println(beanName);
        }
        System.out.println("==================================");

        // fetch the bean with beanName=Audi and type Vehicle
        Vehicle audi = context.getBean("Audi", Vehicle.class);
        System.out.println(audi.getName());

        // fetch the bean with beanName Ferrari and type Vehicle
        Vehicle ferrari = context.getBean("Ferrari", Vehicle.class);
        System.out.println(ferrari.getName());

        // fetch the default bean (with @Primary annotation)
        Vehicle defaultBean = context.getBean(Vehicle.class);
        System.out.println(defaultBean.getName());
    }
}