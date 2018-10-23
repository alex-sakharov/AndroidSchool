package com.company;

public class Cat extends Animal {

    public Cat(String breed, String name) {
        super(breed, name);
    }

    @Override
    public String toString() {
        return "Cat, " + super.toString();
    }

    @Override
    protected String getSound() {
        return "Meow!";
    }

    @Domesticated
    public static class PersianCat extends Cat {
        public PersianCat (String name) {
            super ("PersianCat", name);
        }
    }

    public static class MaineCoon extends Cat {
        public MaineCoon (String name) {
            super ("MaineCoon", name);
        }
    }
}

