package com.homeworkweek1.bakery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "SYRUP.TYPE", havingValue = "chocolate")
public class chocosyrup implements Syrupint{
    @Override
    public String bakecake() {
        return "Cake with the chocolate SYRUP";
    }
}
