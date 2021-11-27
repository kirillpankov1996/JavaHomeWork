package com.pb.lol;

public class Les11 {
    public static void main(String[] args) {
        int temp = function(3, 4);
        System.out.print(temp);
    }

    public static int function(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++)
            result *= a;
        return result;

    }
}

