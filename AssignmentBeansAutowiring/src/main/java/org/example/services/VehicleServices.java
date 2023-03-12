package org.example.services;

import org.example.speakers.BoseSpeaker;
import org.example.speakers.Speaker;
import org.example.tyres.BridgeStoneTyre;
import org.example.tyres.Tyre;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {

    Speaker speaker;
    Tyre tyre;

    VehicleServices() {
        this.speaker = new BoseSpeaker();
        this.tyre = new BridgeStoneTyre();
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
