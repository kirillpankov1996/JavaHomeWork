package com.pb.lol.java_rush.Arrays;
import java.util.Scanner;

//        Считать 6 строк и заполнить ими массив strings.
//        Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").
//        {"Hello", "Hello", "World", "Java", "Tasks", "World"}
//        {null, null, null, "Java", "Tasks", null}

public class ArraysNull {
    public static String[] strings;

    public static void main(String[] args) {
        strings = new String[6];




        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}