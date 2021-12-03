package com.pb.lol.EPAM;
import java.util.Scanner;
public class Hello {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Доброго времени суток, " + name + "!");
    }
}
