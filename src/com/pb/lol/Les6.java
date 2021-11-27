package com.pb.lol;
import java.util.Scanner;
public class Les6 {
    public static void main (String[] args){
        Scanner num = new Scanner (System.in);
        float first, second, result;
        System.out.println("Enter first number: ");
        first = num.nextFloat();
        System.out.println("Enter second number: ");
        second = num.nextFloat();
        result = first + second;
        System.out.print("Result is - "+ result);
    }

}
