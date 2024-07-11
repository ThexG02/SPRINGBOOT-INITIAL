package com.homeworkweek1.bakery;

import org.springframework.stereotype.Service;

@Service

public class Frosting {
    final private Frostint fr;
    public Frosting(Frostint fr){
        this.fr=fr;
    }
    String bakecake(){
        return fr.bakecake();
    }
}
