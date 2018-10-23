package com.company;

import java.lang.annotation.Annotation;

public abstract class Animal {
    private String mName;
    private String mBreed;

    private enum State {
        SLEEPING,
        AWAKEN,
        DEAD
    }

    private State mState = State.AWAKEN;

    public Animal(String breed, String name) {
        mBreed = breed;
        mName = name;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        if (mBreed != null) {
            result.append(mBreed);
            result.append(", ");
        }
        result.append(mName);

        for (Annotation a: getClass().getAnnotations()) {
            if (a instanceof Domesticated) {
                result.append(" (Домашнее");
                if (((Domesticated)a).CanGuard()) {
                    result.append(", служебное");
                }
                result.append(')');
                return result.toString();
            }
        }

        result.append(" (Дикое)");
        return result.toString();
    }

    public final void sleep() {
        mState = State.SLEEPING;
    }

    public final void awake() { mState = State.AWAKEN; }

    public final void die() {
        mState = State.DEAD;
    }

    private boolean canTalk() {
        return mState == State.AWAKEN;
    }

    public final void talk() {
        if (canTalk()) {
            System.out.println (getSound());
        }
    }

    protected abstract String getSound();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null) return false;

        if (getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;
        if (!mName.equals(animal.mName)) {
            return false;
        }

        if (mBreed == null) {
            return animal.mBreed == null;
        }

        return mBreed.equals(animal.mBreed);
    }

    @Override
    public int hashCode() {
        int result = mName.hashCode();
        if (mBreed != null) {
            result = 31 * result + mBreed.hashCode();
        }
        return result;
    }

}

