package com.epam_university;
import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        int days = 0;

        if (a < h && b >= a)
            System.out.println("Impossible.");
        else if (a >= h)
            System.out.println(1);
        else {
            while (h != 0) {
                h = (h - a + b);
                days++;
            }
            System.out.println(days-1);
        }
    }
}
