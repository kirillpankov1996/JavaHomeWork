package com.pb.pankov.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static final String START = "Start";
    public static final String EXIT = "Exit";

    public static void main(String[] args) {
        String answer;
        Scanner scanner = new Scanner(System.in);
        int tries;
        int pcNum = generateNumber();
        int count = 0;
        System.out.println("Сейчас мы сыграем в игру. Тебе необходимо угадать число, которое я загадаю");
        System.out.println("Число будет находится в диапазоне от 0 до 100");

        String s;
        do {
            System.out.println("Для начала игры введи '" + START + "'. Для завершения игры введи '" + EXIT + "'");
            s = scanner.next();
        } while (!(START.equals(s) || EXIT.equals(s)));
        while (START.equals(s)) {
            try {
                System.out.print("Попробуйте угадать число:");
                tries = scanner.nextInt();
                if (tries < 0 || tries > 100) {
                    System.out.println("Ошибка! Необходимо ввести число от 0 до 100! Попытка не считается!");
                    continue;
                }
                count++;

                if (tries > pcNum) {
                    System.out.println("Не угадал! Мое число меньше!");
                } else if (tries < pcNum) {
                    System.out.println("Не угадал! Мое число больше!");
                } else {
                    System.out.println("Ура! Ты угадал число c " + count + "й попытки" );
                    break;
                }
            } catch (Exception e) {
                answer = scanner.next();
                if (answer.equals(EXIT)) {
                    System.out.println("Game over!");
                    return;
                } else {
                    System.out.println("Ошибка! Необходимо ввести число от 0 до 100! Попытка не считается!");
                }
            }

        }

    }

    public static int generateNumber() {
        return new Random().nextInt(101);
    }

}