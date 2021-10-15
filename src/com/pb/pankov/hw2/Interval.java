package com.pb.pankov.hw2;
import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        int digit;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число в промежутке [0-100]: ");
        digit = scanner.nextInt();

        if (digit <= 14 && digit >= 0) {
            System.out.println("Введенное число находится в промежутке [0-14]");
        } else if (digit <= 35 && digit >= 15) {
            System.out.println("Введенное число находится в промежутке [15-35]");
        } else if (digit <= 50 && digit >= 36) {
            System.out.println("Введенное число находится в промежутке [36-50]");
        } else if (digit <= 100 && digit >= 51) {
            System.out.println("Введенное число находится в промежутке [51-100]");
        } else {
            System.out.println("Введенное число находится вне промежутка [0-100]");
        }
    }
}
