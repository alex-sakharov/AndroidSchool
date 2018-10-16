package com.company;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
	    Dog bullDog = new Dog.BullDog("Buddy");
	    out.println(bullDog);

	    bullDog.talk();

	    bullDog.sleep();
        bullDog.talk();

        bullDog.awake();
        bullDog.talk();

        Dog poodle = new Dog.Poodle("Buddy");
        out.println(poodle);

        poodle.die();
        poodle.talk();

        out.println("bullDog eq poodle: " + bullDog.equals(poodle));

        Dog.Poodle poodle2 = new Dog.Poodle("Buddy");
        out.println("poodle eq poodle2: " + poodle.equals(poodle2));

        Cat cat1 = new Cat.MaineCoon ("Tim");
        cat1.talk();
        Cat cat2 = new Cat.MaineCoon ("Vasya");
        out.println("cat1 eq cat2: " + cat1.equals(cat2));
    }
}
