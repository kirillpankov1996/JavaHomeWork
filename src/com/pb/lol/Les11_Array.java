package com.pb.lol;
import java.util.Arrays;
import java.util.Scanner;

public class Les11_Array {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int [10];
        for(int i=0; i<array.length; i++){
            System.out.println("Введите %d-e число массива", (i + 1));
            array[i] = scanner.nextInt();
        }

    }
}







/*
Массив 10 эллементов
Сумма элементов
2. Создайте класс Array в пакете hw3.
Программа должна позволить пользователю ввести одномерный массив целых чисел размерностью 10 элементов.
        Вывести на экран введенный массив.
        Подсчитать сумму всех элементов массива и вывести ее на экран.
        Подсчитать и вывести на экран количество положительных элементов.
        Произвести сортировку этого массива от меньшего к большему по алгоритму сортировки пузырьком.
        (https://en.wikipedia.org/wiki/Bubble_sort)
        Вывести на экран отсортированный массив
 */