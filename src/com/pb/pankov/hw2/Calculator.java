package com.pb.pankov.hw2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int operand1;
        int operand2;
        String sign;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение первого операнда: ");
        operand1 = scanner.nextInt();
        System.out.println("Введите значение второго операнда: ");
        operand2 = scanner.nextInt();
        System.out.println("Введите знак арифметической операци: ");
        sign = scanner.next();

        switch (sign) {
            case "+":
                System.out.println(operand1 + " + " + operand2 + " = " + (operand1 + operand2));
                break;
            case "-":
                System.out.println(operand1 + " - " + operand2 + " = " + (operand1 - operand2));
                break;
            case "*":
                System.out.println(operand1 + " * " + operand2 + " = " + (operand1 * operand2));
                break;
            case "/":
                if (operand2 != 0) {
                    System.out.println(operand1 + " / " + operand2 + " = " + ((float) operand1 / operand2));
                } else {
                    System.out.println("Делить на ноль нельзя.");
                }
                break;
            default:
                System.out.println("Калькулятор может только складывать, отнимать, умножать и делить.");
        }
    }
}
