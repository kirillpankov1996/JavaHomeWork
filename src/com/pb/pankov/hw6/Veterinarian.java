package com.pb.pankov.hw6;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Veterinarian {
    void treatAnimal(Animal animal) {
        try {
            Field privateStringFieldFood = Animal.class.
                    getDeclaredField("food");
            privateStringFieldFood.setAccessible(true);
            String foodValue = (String) privateStringFieldFood.get(animal);
            Field privateStringFieldLocation = Animal.class.
                    getDeclaredField("location");
            privateStringFieldLocation.setAccessible(true);
            String locationValue = (String) privateStringFieldLocation.get(animal);
            System.out.println("Еда - " + foodValue + ". Локация - " + locationValue);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
