package com.pb.lol.epam;
import java.util.Scanner;

public class Cal {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        int[] array = new int [5];
        int sum = 0;
        int inc = 1;
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите " + (i + 1) + "-e целое число");
            array[i] = scanner.nextInt();
            sum += array[i];
            inc *= array[i];
        }
        System.out.println("Сумма элементов: " + sum);
        System.out.println("Произведение элементов: " + inc);
    }
}
