package com.pb.pankov.hw6;

import org.jetbrains.annotations.NotNull;

public class Dog extends Animal {

    protected String breed;

    public String getBreed() {
        return breed;
    }

    public Dog(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Woof!");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat " + food);
    }

    @Override
    public String toString() {
        return "Animal: Dog\nBreed: " + breed + "\nFood: " + food + "\nLocation: " + location;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}