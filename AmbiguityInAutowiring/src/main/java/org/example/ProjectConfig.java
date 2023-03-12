package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {

    // if name of the bean is not provided, then the method name will become the name of the bean
    @Bean("vehicle1")
    public Vehicle vehicle1() {
        Vehicle veh = new Vehicle();
        veh.setName("vehicle1");
        return veh;
    }

    @Bean("vehicle2")
    public Vehicle vehicle2() {
        Vehicle veh = new Vehicle();
        veh.setName("vehicle2");
        return veh;
    }

    @Primary
    @Bean("vehicle3")
    public Vehicle vehicle3() {
        Vehicle veh = new Vehicle();
        veh.setName("vehicle3");
        return veh;
    }

}
