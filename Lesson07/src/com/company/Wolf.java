package com.company;

public class Wolf extends Animal {

    public Wolf(String name) {
        super(null, name);
    }

    @Override
    public String toString() {
        return "Wolf, " + super.toString();
    }

    @Override
    protected String getSound() {
        return "Уууу!";
    }
}

