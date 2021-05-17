package com.bsejawal.behavioral.strategy.derek_danas;

public class Bird extends Animal {
    public Bird(){
        setSound("Tweet");
        flyingType = new ItFlys();
    }
}
