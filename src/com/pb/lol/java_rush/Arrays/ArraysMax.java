package com.pb.lol.java_rush.Arrays;
import java.util.*;
//      Ввести с клавиатуры число N.
//      Считать N целых чисел и заполнить ими массив array.
//      Найти максимальное число среди элементов массива.

public class ArraysMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for(int i = 0; i < n; i++)
            array[i] = scanner.nextInt();

        int max = array[0];
        for (int i = 1; i < n; i++) {
            int number = array[i];
            if (number > max)
                max = number;
        }
        System.out.println(max);
    }
}
