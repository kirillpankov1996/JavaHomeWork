package com.epam_university;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        if (count == 0)
            System.out.println("Oh, it looks like there is no one here.");
        else if (count < 0)
            System.out.println("Seriously? Why so negative.");
        else {
            String [] names = new String[count];
            int i = 0;
            while (i < count) {
                 names[i] = scanner.nextLine();
                 i++;
            }
            i = 0;
            while (i < count) {
                System.out.println("Hello, " + names[i]);
                i++;
            }
//            System.out.println("Hello " + String.join(", ", names));
        }
    }
}
