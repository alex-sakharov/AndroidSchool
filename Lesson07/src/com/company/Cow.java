package com.company;

@Domesticated
public class Cow extends Animal {
    public Cow(String name) {
        super(null, name);
    }

    @Override
    public String toString() {
        return "Cow, " + super.toString();
    }

    @Override
    protected String getSound() {
        return "Мууууу!";
    }
}

