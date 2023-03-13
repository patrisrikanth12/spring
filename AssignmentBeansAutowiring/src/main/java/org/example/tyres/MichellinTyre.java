package org.example.tyres;

import org.springframework.stereotype.Component;

@Component
public class MichellinTyre implements Tyre {
    public void rotate() {
        System.out.println("Michellin Tyre is rotating...");
    }
}
