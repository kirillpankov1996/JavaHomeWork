package com.pb.lol;
public class Les11_Anagram {
    public static void main (String[] args){

    String text = "ЭтоКириллАйтишникб";
    String result = text.substring(0, 3)
            + " "
            + text.substring(3, 9)
            + " "
            + text.substring(9, 10).toLowerCase()
            + text.substring(10, 17);

    System.out.println(result);
}
}
