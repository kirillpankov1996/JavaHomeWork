package com.pb.pankov.hw6;

import java.util.ArrayList;
import java.util.List;

public class VetСlinic {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        Cat cat = new Cat();
        cat.setName("Кот");
        cat.setCoatColor("Рыжий");
        cat.setFood("Молоко");
        cat.setLocation("Кухня");

        Dog dog = new Dog();
        dog.setName("Собака");
        dog.setDogBreed("Овчарка");
        dog.setFood("Кость");
        dog.setLocation("Будка");

        Horse horse = new Horse();
        horse.setName("Лошадь");
        horse.setHorseshoe(true);
        horse.setFood("Трава");
        horse.setLocation("Конюшня");

        animals.add(cat);
        animals.add(dog);
        animals.add(horse);

        Veterinarian veterinarian = new Veterinarian();
        for (Animal a: animals) {
            veterinarian.treatAnimal(a);
        }
    }
}