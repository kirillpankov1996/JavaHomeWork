package com.pb.lol.easy;

import java.util.Scanner;

public class Les7_Cal {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Запущена программа, которая высчитывает дискриминант квадратного уравнения'");
        System.out.println("Квадратное уравнение имеет вид 'ax²+bx+c=0'");
        System.out.println("Для решения уравнения введите значение числа 'a'");
        a = scanner.nextInt();
        System.out.println("Введите значение числа 'b'");
        b = scanner.nextInt();
        System.out.println("Введите значение числа 'c'");
        c = scanner.nextInt();
        int D = ((b*b) - (4*a*c));

        System.out.println("Полученное уравнение: " + a + "x²+" + b + "x+" + c + "=0");
        System.out.println("Дискриминант равен числу " + D);
         if (D>0){
             System.out.println("Уравнение имеет два корня");
         }
         else if (D<0) {
             System.out.println("В уравнении нет корней");
         }
         else {
             System.out.println("В уравнении ровно один корень");
         }

    }
}
