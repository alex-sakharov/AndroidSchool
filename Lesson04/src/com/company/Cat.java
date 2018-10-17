package com.company;

public class Cat extends Animal {

    public Cat(String breed, String name) {
        super(breed, name);
    }

    public void talk() {
        if (canTalk()) {
            System.out.println ("Meow!");
        }
    }

    @Override
    public String toString() {
        return "Cat, " + super.toString();
    }

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

