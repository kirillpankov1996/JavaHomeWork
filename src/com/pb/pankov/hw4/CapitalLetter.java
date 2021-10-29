package com.pb.pankov.hw4;
import java.util.Scanner;
public class CapitalLetter {
    public static void main(String[] args)
    {
        Scanner  scan = new Scanner(System.in);
        System.out.print(" Введите текст: ");
        String str=scan.nextLine();

        printCapitalized( str );
    }

    static void printCapitalized( String str ) {
        char ch;
        char prevCh;
        int i;
        prevCh = '.';
        for ( i = 0;  i < str.length();  i++ ) {
            ch = str.charAt(i);
            if ( Character.isLetter(ch)  &&  ! Character.isLetter(prevCh) )
                System.out.print( Character.toUpperCase(ch) );
            else
                System.out.print( ch );
            prevCh = ch;
        }
        System.out.println();
    }
}
