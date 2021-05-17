package com.bsejawal.behavioral.strategy.derek_danas;

public interface Flys {
    String fly();
}
class ItFlys implements Flys{

    @Override
    public String fly() {
        return "Flying High";
    }
}

class CantFlys implements Flys{

    @Override
    public String fly() {
        return "I can't fly";
    }
}
