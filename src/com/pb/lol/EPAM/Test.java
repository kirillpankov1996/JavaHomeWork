package com.pb.lol.EPAM;
import java.util.Scanner;
public class Test {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] array = new int [n];

        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            array[i] = value;
        }

        System.out.println(array[n-1]);


    }
}