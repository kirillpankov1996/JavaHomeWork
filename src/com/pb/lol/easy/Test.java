package com.pb.lol.easy;

public class Test {
    public static void main(String[] args) {
        int i = 3;
        byte b = 1;
        byte b1 = 1+2;
//        short s = 304111; -- от -32768 до 32767
        short s1 = (short) 304111;

//        b = b1 + 1;
        b = (byte) (b1 + 1);

//        b = -b;
       b = (byte) -b;

        b1 *= 2;
//        b = i;
       b = (byte) i;
       b += i++;
       float f = 1.1f;
       b /= f;

        System.out.println(b);


    }
}
