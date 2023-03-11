package org.example;

import org.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


// @Configuration Specifies that, it is a Configuration Class
// If Config have multiple methods that are returning same Type, specify beanNames to the individual bean
// Otherwise, NoUniqueBean.... exception will be raised
@Configuration
public class ProjectConfig {

    // Bean means, it is maintained/managed by IoC container
    @Bean("Audi")
    Vehicle vehicle1() {
        System.out.println("Audi vehicle Bean is in building phase...");
        Vehicle veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }

    // @Primary is used to specify the default Bean when no name is providing while accessing the bean
    @Primary
    @Bean("Ferrari")
    Vehicle vehicle2() {
        System.out.println("Ferrari vehicle Bean is in building phase...");
        Vehicle veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }
}
