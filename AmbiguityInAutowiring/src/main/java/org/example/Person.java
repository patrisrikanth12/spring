package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    public String name = "John";

    public Vehicle vehicle;

    // step : 1
    //       search by Type
    // step : 2
    //       select the bean which is matching to the name of the parameter in constructor / name of the field.
    //       This method is not recommended because if name of the parameter/field is changed, then Autowiring breaks
    // step : 3
    //       if name not matched with any of the beans, select the bean which is marked @Primary
    // step : 4
    //       raise NoUniqueBeanDefinition exception


    // to avoid ambiguity, use @Qualifier(<name of the bean>) with parameter/field
    // ex: Person(@Qualifier("vehicle2") Vehicle vehicle)
    // the above line selects the bean which have name="vehicle2"
    @Autowired
    Person(@Qualifier("vehicle2") Vehicle vehicle) {
        System.out.println("selected vehicle is " + vehicle.getName());
        this.vehicle = vehicle;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
