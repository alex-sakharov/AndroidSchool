package com.company;

public abstract class Animal {
    protected String mName;
    protected String mBreed;
    private boolean mSleeping = false;
    private boolean mDead = false;

    public Animal(String breed, String name) {
        mBreed = breed;
        mName = name;
    }

    @Override
    public String toString() {
        return mBreed + ", " + mName;
    }

    public final void sleep() {
        mSleeping = true;
    }

    public final void awake() {
        mSleeping = false;
    }

    public final void die() {
        mDead = true;
    }

    private final boolean canTalk() {
        return !mDead && !mSleeping;
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
        return mName.equals(animal.mName) && mBreed.equals(animal.mBreed);
    }

    @Override
    public int hashCode() {
        int result = mName.hashCode();
        result = 31 * result + mBreed.hashCode();
        return result;
    }
}

