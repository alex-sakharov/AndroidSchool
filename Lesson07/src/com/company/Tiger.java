package com.company;

public class Tiger extends Animal {

    public Tiger(String name) {
        super(null, name);
    }

    @Override
    public String toString() {
        return "Tiger, " + super.toString();
    }

    @Override
    protected String getSound() {
        return "Рррррр!";
    }
}

