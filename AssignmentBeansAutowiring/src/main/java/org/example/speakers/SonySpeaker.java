package org.example.speakers;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class SonySpeaker implements Speaker{
    public void makeSound() {
        System.out.println("Sony Speaker is making the sound...");
    }
}
