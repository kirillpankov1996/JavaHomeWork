package com.pb.pankov.hw8;

import java.util.Scanner;

public class OnlineShop {

    public static void main(String[] args) {
        Auth auth = new Auth();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Sign Up");
            try {
                System.out.println("Введите логин (длина 5-10 символов, латинские буквы или цифры)");
                System.out.println("Логин: ");
                String login = scanner.next();
                System.out.println("Введите пароль (длина 5 и более символов, латинские буквы или цифры)");
                System.out.println("Пароль: ");
                String password = scanner.next();
                System.out.println("Подтвердите пароль: ");
                String confirmPassword = scanner.next();
                auth.signUp(login, password, confirmPassword);
                break;
            } catch (WrongLoginException | WrongPasswordException e) {
                System.out.println(e.getMessage());
                System.out.println("Попробуйте снова");
            }
        }
        System.out.println("___________________________");
        while (true) {
            System.out.println("Sign In");
            try {
                System.out.println("Введите логин");
                System.out.println("Логин: ");
                String login = scanner.next();
                System.out.println("Введите пароль");
                System.out.println("Пароль: ");
                String password = scanner.next();
                auth.signIn(login, password);
                break;
            } catch (WrongLoginException e) {
                System.out.println(e.getMessage());
                System.out.println("Попробуйте снова");
            }
        }
    }
}

