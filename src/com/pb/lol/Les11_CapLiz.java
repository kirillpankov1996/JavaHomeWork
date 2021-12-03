package com.pb.lol;
import java.util.Scanner;
public class Les11_CapLiz {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = scanner.nextLine();
        String result = text.substring(0, 2).toUpperCase() + text.substring(1);
        System.out.println("Текст с измененным регистром: " + result);
    }
}