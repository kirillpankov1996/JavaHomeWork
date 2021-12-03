package com.pb.lol.EPAM;
import javax.xml.soap.SOAPPart;
import java.util.Scanner;
public class Month {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 12, чтобы я указал соотвестующий числу месяц:");
        int num = scanner.nextInt();
        switch (num){
            case 1:
                System.out.println("Это Январь");
                break;
            case 2:
                System.out.println("Это Февраль");
                break;
            case 3:
                System.out.println("Это Март");
                break;
            case 4:
                System.out.println("Это Апрель");
                break;
            case 5:
                System.out.println("Это Май");
                break;
            case 6:
                System.out.println("Это Июнь");
                break;
            case 7:
                System.out.println("Это Июль");
                break;
            case 8:
                System.out.println("Это Август");
                break;
            case 9:
                System.out.println("Это Сентябрь");
                break;
            case 10:
                System.out.println("Это Октябрь");
                break;
            case 11:
                System.out.println("Это Ноябрь");
                break;
            case 12:
                System.out.println("Это Декабрь");
                break;
            default:
                System.out.println("Ошибка! Необходимо ввести число от 1 до 12!");
        }
    }
}
