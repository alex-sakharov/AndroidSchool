package com.company;

@Domesticated(CanGuard = true)
public class Dog extends Animal {
    public Dog(String breed, String name) {
        super(breed, name);
    }

    @Override
    public String toString() {
        return "Dog, " + super.toString();
    }

    public static class BullDog extends Dog {
         public BullDog(String name) {
             super("Bulldog", name);
         }
    }

    public static class Poodle extends Dog {
        public Poodle(String name) {
            super("Poodle", name);
        }
    }

    @Override
    protected String getSound() {
        return "Woof!";
    }
}

