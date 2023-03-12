package org.example;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class ProjectConfig {

    // Here, spring will check whether there is a bean with type Vehicle
    // It automatically passes the vehicle bean to the person method
    // That means, new Vehicle object is not created and passed to the vehicle method
    // the existing vehicle object in the context,  will be passed
    // Spring is smart enough to create vehicle bean before creating the person bean because person depends on vehicle
    // This is known as autowiring using method params
    @Bean
    public Person person(Vehicle vehicle) {
        Person person = new Person();
        person.setName("John");
        person.setVehicle(vehicle);
        return person;
    }
    @Bean
    public Vehicle vehicle() {
        Vehicle veh = new Vehicle();
        veh.setName("Toyoto");
        return veh;
    }

}
