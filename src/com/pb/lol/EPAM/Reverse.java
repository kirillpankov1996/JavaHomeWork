package com.pb.lol.EPAM;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = scanner.nextLine();
        String reverse = new StringBuffer(text).reverse().toString();
        System.out.println("Текст до реверса: " + text);
        System.out.println("Текст после реверса: " + reverse);
    }
}
