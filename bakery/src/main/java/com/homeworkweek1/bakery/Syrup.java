package com.homeworkweek1.bakery;

import org.springframework.stereotype.Service;

@Service
public class Syrup {
    final private Syrupint sr;
    public Syrup(Syrupint sr){
        this.sr=sr;
    }
    String bakecake(){
       return sr.bakecake();
    }
}
