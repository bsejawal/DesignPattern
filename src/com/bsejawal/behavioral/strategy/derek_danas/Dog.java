package com.bsejawal.behavioral.strategy.derek_danas;

public class Dog extends Animal {
    public Dog(){
        super();
        setSound("Bark");
        flyingType = new CantFlys();
    }
    public void digHole(){
        System.out.println("Dug a hole");
    }
}
