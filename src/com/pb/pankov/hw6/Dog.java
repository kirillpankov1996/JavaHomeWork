package com.pb.pankov.hw6;
import java.util.Objects;

public class Dog extends Animal{
    private String dogBreed;

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public void breed(){
        System.out.println(name + " породы \"" + dogBreed + "\"");
    }
    @Override
    public void makeNoise(){
        System.out.println(name + " Гавкает");
    }
    @Override
    public void eat(){
        System.out.println(name + "Грызет");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(dogBreed, dog.dogBreed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dogBreed);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", dogBreed='" + dogBreed + '\'' +
                '}';
    }
}