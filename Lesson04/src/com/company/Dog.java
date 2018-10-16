package com.company;

public class Dog extends Animal {

    public Dog(String breed, String name) {
        super(breed, name);
    }

    public void talk() {
        if (canTalk()) {
            System.out.println("Woof!");
        }
    }

    @Override
    public String toString() {
        return "Dog, " + super.toString();
    }

    public static class BullDog extends Dog {
         public BullDog(String name) {
             super("Bulldod", name);
         }
    }

    public static class Poodle extends Dog {
        public Poodle(String name) {
            super("Poodle", name);
        }
    }}
