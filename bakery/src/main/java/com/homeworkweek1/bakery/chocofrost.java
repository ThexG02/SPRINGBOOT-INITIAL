package com.homeworkweek1.bakery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "FROSTING.TYPE", havingValue = "chocolate")
public class chocofrost implements Frostint{
    @Override
    public String bakecake() {
        return "cake with the chocolate FROSTING";
    }
}
