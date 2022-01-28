package com.pb.lol.epam;
import java.util.Scanner;
import java.util.Arrays;
public class OptionalTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);

        int lengthA = String.valueOf(Math.abs(a)).length();
        int lengthB = String.valueOf(Math.abs(b)).length();
        int lengthC = String.valueOf(Math.abs(c)).length();

        double avgLength = (lengthA + lengthB + lengthC) / 3;

        int[] array = new int[]{a,b,c};


        System.out.println(("Максимальное число: ") + max);
        System.out.println(("Длинна числа: ") + String.valueOf(Math.abs(max)).length() + " цифры.");

        System.out.println(("Минимальное число: ") + min);
        System.out.println(("Длинна числа: ") + String.valueOf(Math.abs(min)).length() + " цифры.");

        if (lengthA > avgLength){
            System.out.println("Число, длинна которого больше средней длины по всем числам: " + a + ". Его длинна: " + lengthA +" цифры." );
        }
        else if (lengthB > avgLength){
            System.out.println("Число, длинна которого больше средней длины по всем числам: " + b + ". Его длинна: " + lengthB +" цифры." );
        }
        else {
            System.out.println("Число, длинна которого больше средней длины по всем числам: " + c + ". Его длинна " + lengthC +" цифры." );
        }

        Arrays.sort(array);
        System.out.println("Числа в порядке возврастания: " + Arrays.toString(array));





    }
}
