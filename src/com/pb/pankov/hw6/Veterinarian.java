package com.pb.pankov.hw6;

public class Veterinarian {
    private String name;

    public Veterinarian(String name) {
        this.name = name;
    }

    private String checkAnimal(Animal animal) {
        if (animal instanceof Cat)
            return "Кот";
        if (animal instanceof Dog)
            return "Пес";
        if (animal instanceof Horse)
            return "Конь";
        return "Неизвестное животное";
    }

    public void treatAnimal(Animal animal) {
        System.out.println(checkAnimal(animal) + " из г." + animal.getLocation()
                + ", любимая пища " + animal.getFood());
    }

    @Override
    public String toString() {
        return "Прием ведет ветеринар " + name;
    }
}
