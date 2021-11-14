package com.pb.pankov.hw6;

import java.util.Objects;

public class Horse extends Animal{
    private boolean isHorseshoe;

    public boolean isHorseshoe() {
        return isHorseshoe;
    }

    public void setHorseshoe(boolean horseshoe) {
        isHorseshoe = horseshoe;
    }

    public void horseshoe(){
        if(isHorseshoe == true){
            System.out.println(name + " подкованная");
        } System.out.println(name + " неподкованная");
    }
    @Override
    public void makeNoise(){
        System.out.println(name + "Ржет");
    }
    @Override
    public void eat(){
        System.out.println(name + "Жует");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return isHorseshoe == horse.isHorseshoe;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isHorseshoe);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", isHorseshoe=" + isHorseshoe +
                '}';
    }
}