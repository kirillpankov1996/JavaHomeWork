package com.pb.pankov.hw13;

public class Main {

    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Thread supplier = new Thread(() -> {
            for (int i = 1; i < 6; i++) {
                buffer.supply();
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i < 6; i++) {
                buffer.consume();
            }
        });

        supplier.start();
        consumer.start();
    }

}
