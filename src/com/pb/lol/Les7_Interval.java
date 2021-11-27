package com.pb.lol;

import java.util.Scanner;

public class Les7_Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Введите числе в интервале от 0 до 100");
        num = scan.nextInt();

        if (num <= 14 && num >= 0) {
            System.out.print("Введенное число находится в диапазоне от 0 до 14 включительно");
        } else if (num <= 35 && num >= 15){
            System.out.print("Введенное число находится в диапазоне от 15 до 35 включительно");
        }
        else if (num <= 50 && num >= 36){
            System.out.print("Введенное число находится в диапазоне от 36 до 50 включительно");
        }
        else if (num <= 100 && num >= 51){
            System.out.print("Введенное число находится в диапазоне от 41 до 100 включительно");
        }
        else {
            System.out.print("Ошибка! Введенное число находится вне интервала от 0 до 100");
        }
    }
}

