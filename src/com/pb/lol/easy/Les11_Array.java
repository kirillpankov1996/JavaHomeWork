package com.pb.lol.easy;

import java.util.Arrays;
import java.util.Scanner;

public class Les11_Array {
    public static void main(String[] args) {
        int[] array = new int[10];
        int sumAllElements = 0;
        int countPositiveElements = 0;
        int sortArray;
        boolean sortState = false;


        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Введите %d-e число массива: ", (i + 1));
            array[i] = scanner.nextInt();

            if (array[i] > 0) {
                countPositiveElements++;
            }
            sumAllElements += array[i];
        }

        System.out.println("Вы ввели массивы из чисел: " + Arrays.toString(array));
        System.out.println("Сумма всех элементов массива: " + sumAllElements);
        System.out.println("Количество положительных элементов массива: " + countPositiveElements);

        while (!sortState) {
            sortState = true;
            for (int i = 0; i < (array.length - 1); i++) {
                if (array[i] > array[i + 1]) {
                    sortState = false;
                    sortArray = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = sortArray;

                }

            }

        }
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }

}


