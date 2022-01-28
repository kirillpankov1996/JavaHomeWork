package com.epam_university;
import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPeople = scanner.nextInt();
        int countSlicePizza = scanner.nextInt();
        int sum = 0;
        sum += countSlicePizza;
        int i = 1;


        while (sum % countPeople != 0) {
            sum += countSlicePizza;
            i++;
        }
        System.out.println(i);
    }
}
