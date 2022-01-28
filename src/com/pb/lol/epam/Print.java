package com.pb.lol.epam;
import java.util.Scanner;
import java.util.Random;
public class Print {
    public static void main (String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите желаемое количество случайных чисел: ");
        int count = scanner.nextInt();
        System.out.println("Введите желаемый диапазан");
        System.out.println("Минимальное число: ");
        int min = scanner.nextInt();
        System.out.println("Максимальное число: ");
        int max = scanner.nextInt();
        System.out.println("Выбранный диапазон чисел от " + min + " до " + max);
        System.out.println("Программа генерирует " + count + " случайных чисел");

        for (int i = 0; i < count; i++ ){

            int result = random.nextInt(max-min) + min;
            System.out.println((i+1) + "-е случайное целое число: " + result );
        }

    }
}
