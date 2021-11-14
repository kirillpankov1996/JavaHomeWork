package com.pb.pankov.hw6;

import java.util.Objects;

public class Cat extends Animal{
    private String coatColor;

    public String getCoatColor() {
        return coatColor;
    }

    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
    }

    public void Color(){
        coatColor = "red";
        System.out.println(name + " " + coatColor);
    }
    @Override
    public void makeNoise(){
        System.out.println(name + "Мяукает");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(coatColor, cat.coatColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coatColor);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", coatColor='" + coatColor + '\'' +
                '}';
    }
    @Override
    public void eat(){
        System.out.println(name + "Лакает");
    }
}