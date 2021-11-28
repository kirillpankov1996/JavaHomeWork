package com.pb;

import java.util.Random;
import java.util.Scanner;


public class Les11_Bingo {

    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        System.out.println("Приветствую! Сейчас я сыграю с тобой в игру 'Угадай число'");
        System.out.println("Если ты вруг решишь закончить игру досрочно, просто введи цифру '0'");
        System.out.println("Я загадал число от 1 до 100 включительно. Попробуй угадать, введи число");
        int i = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            i++;

            if (answer == randomNumber) {
                System.out.println("Поздравляю! Ты угадал число c " + i + "-й попытки!");
                break;
            }
            if (answer == 0) {
                System.out.println("Game over!");
                break;
            }
            if (answer < randomNumber) {
                System.out.println("Не угадал! Мое число больше. Попробуй еще!");
            } else if (answer > randomNumber) {
                System.out.println("Не угадал! Мое число меньше.Попробуй еще!");
            } else if (answer < 0 || answer > 100) {
                System.out.println("Не угадал! Мое число находится в интервале от 1 до 100");
            }
        }
    }
}