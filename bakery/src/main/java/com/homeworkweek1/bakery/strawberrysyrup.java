package com.homeworkweek1.bakery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "SYRUP.TYPE", havingValue = "starwberry")
public class strawberrysyrup implements Syrupint{
    @Override
    public String bakecake() {
        return "cake with the strawberry SYRUP";
    }
}
