package org.example.beans;

import org.example.services.VehicleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    String name;

    public VehicleServices getVehicleServices() {
        return vehicleServices;
    }

    public void setVehicleServices(VehicleServices vehicleServices) {
        this.vehicleServices = vehicleServices;
    }

    @Autowired
    VehicleServices vehicleServices;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
