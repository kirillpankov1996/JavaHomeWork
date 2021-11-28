package com.pb.pankov.hw10;

public class NumBox<T extends Number> {

    private final T[] numbers;
    private int capacity;
    private int counter = 0;


    public NumBox(int capacity) {
        this.capacity = capacity;
        numbers = (T[]) new Number[capacity];
    }

    public void add(T number) throws IllegalStateException {
        if (counter >= capacity) {
            throw new IllegalStateException("array is full");
        }
        this.numbers[counter++] = number;
    }

    public T get(int index) {
        return numbers[index];
    }

    public int length() {
        return counter;
    }

    public double average() {
        return sum() / length();
    }

    public double sum() {
        double sum = 0;
        for (int i = 0; i < length(); i++) {
            sum += get(i).doubleValue();
        }
        return sum;
    }

    public T max() {
        T max = null;
        for (int i = 0; i < length(); i++) {
            T current = get(i);
            if (max == null || current.doubleValue() > max.doubleValue()) {
                max = current;
            }
        }
        return max;
    }
}