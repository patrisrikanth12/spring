package org.example.speakers;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BoseSpeaker implements Speaker{
    public void makeSound() {
        System.out.println("Bose Speaker is making sound...");
    }
}
