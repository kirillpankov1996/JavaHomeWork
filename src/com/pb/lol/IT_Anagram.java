package com.pb.lol;
import java.util.Scanner;
import java.util.Arrays;

public class IT_Anagram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String text1 = scanner.nextLine();
        System.out.println("Введите вторую строку: ");
        String text2 = scanner.nextLine();

        text1 = text1.toLowerCase();
        text2 = text2.toLowerCase();

        text1 = text1.replaceAll("[^\\p{L}]","");
        text2 = text2.replaceAll("[^\\p{L}]","");

        char[] letters1 = text1.toCharArray();
        char[] letters2 = text2.toCharArray();

        Arrays.sort(letters1);
        Arrays.sort(letters2);

        System.out.println(Arrays.toString(letters1));
        System.out.println(Arrays.toString(letters2));

      if (Arrays.equals(letters1, letters2)) {
            System.out.println("Это анаграмма!");
        }
        else {
            System.out.println("Это НЕ анаграмма!");
            }
    }
}
