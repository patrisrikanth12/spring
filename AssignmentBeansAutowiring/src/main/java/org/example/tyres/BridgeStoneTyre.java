package org.example.tyres;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BridgeStoneTyre implements Tyre {
    public void rotate() {
        System.out.println("BridgeStone Tyre is rotating...");
    }
}
