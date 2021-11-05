package com.pb.pankov.hw6;

public class Veterinarian {

    public void treatAnimal(Animal animal) {
        System.out.println("Food : " + animal.getFood() + "\nLocation: " + animal.getLocation());
    }
}