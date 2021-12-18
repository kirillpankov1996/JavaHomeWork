package com.pb.pankov.hw13;

import java.util.*;

public class Buffer {

    private Queue<String> buffer;

    public Buffer() {
        this.buffer = new LinkedList<>();
    }

    public synchronized void supply() {
        while (buffer.size() != 0) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Buffer creating started");
        Random random = new Random();
        buffer.add("first number: " + random.nextInt());
        buffer.add("second number: " + random.nextInt());
        buffer.add("third number: " + random.nextInt());
        buffer.add("forth number: " + random.nextInt());
        buffer.add("fifth number: " + random.nextInt());
        System.out.println("Buffer created");
        notify();
    }

    public synchronized void consume() {
        while (buffer.size() != 5) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Buffer: ");
        buffer.forEach(System.out::println);

        System.out.println("Buffer clearing started");
        buffer.clear();
        System.out.println("Buffer cleared");
        System.out.println();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        notify();
    }
}
