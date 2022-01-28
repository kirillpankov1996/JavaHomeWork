package com.pb.lol.java_rush.Arrays;
import java.util.*;

//        Ввести с клавиатуры число N.
//        Считать N целых чисел и заполнить ими массив.
//        Найти минимальное число среди элементов массива и вывести в консоль.


public class ArraysMin {
    public static int[] array;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        array = new int[n];

        for (int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
            }

        int min = array[0];

        for(int i = 1; i<n; i++){
            int number = array[i];
            if (number < min)
                min = number;
        }
        System.out.println(min);
    }
}
