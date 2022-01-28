package com.epam_university;
import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();
        int hours = n / 3600;
        int minutes = (n - hours * 3600) / 60;
        int seconds = (n - hours * 3600) - minutes * 60;

        System.out.format(hours + ":" + "%02d" + ":" + "%02d", minutes, seconds);
    }
}
