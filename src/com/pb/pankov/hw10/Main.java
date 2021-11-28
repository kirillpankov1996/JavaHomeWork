package com.pb.pankov.hw10;

public class Main {
    public static void main(String[] args) {
        NumBox<Float> floatNumbers = new NumBox<>(5);
        System.out.println("Created NumBox with capacity 5 and parameterized by Float:");
        floatNumbers.add((float) 10);
        floatNumbers.add((float) 11);
        System.out.println("Length after 2 added element: " + floatNumbers.length());
        floatNumbers.add((float) 12);
        floatNumbers.add((float) 13);
        floatNumbers.add((float) 14);
        System.out.println("Element with index 1: " + floatNumbers.get(1));
        System.out.println("Length after 5 added element: " + floatNumbers.length());
        System.out.println("Average: " + floatNumbers.average());
        System.out.println("Sum: " + floatNumbers.sum());
        System.out.println("Max: " + floatNumbers.max());

        System.out.println("__________________________");

        NumBox<Integer> intNumbers = new NumBox<>(4);
        System.out.println("Created NumBox with capacity 4 and parameterized by Integer:");
        intNumbers.add(10);
        System.out.println("Length after 1 added element: " + intNumbers.length());
        intNumbers.add(11);
        intNumbers.add(12);
        intNumbers.add(13);
        System.out.println("Element with index 1: " + intNumbers.get(1));
        System.out.println("Length after 1 added element: " + intNumbers.length());
        System.out.println("Average: " + intNumbers.average());
        System.out.println("Sum: " + intNumbers.sum());
        System.out.println("Max: " + intNumbers.max());
        System.out.println("__________________________");

        System.out.println("Try to add 5th element in Integer NumBox:");
        try {
            intNumbers.add(14);
        } catch (IllegalStateException e) {
            System.out.println("Get exception: " + e.getMessage());
        }
    }
}

