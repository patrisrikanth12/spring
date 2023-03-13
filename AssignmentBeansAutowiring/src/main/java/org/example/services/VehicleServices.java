package org.example.services;

import org.example.speakers.BoseSpeaker;
import org.example.speakers.Speaker;
import org.example.tyres.BridgeStoneTyre;
import org.example.tyres.Tyre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {

    @Autowired
    Speaker speaker;

    @Autowired
    Tyre tyre;

    public void playMusic() {
        speaker.makeSound();
    }

    public void moveVehicle() {
        tyre.rotate();
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public Tyre getTyre() {
        return tyre;
    }
}
