package com.pb.lol;
public class Les11_substring {
    public static void main (String[] args){

    String text = "365";
        String result = text.substring(2, 3);
    /*String result = text.substring(0, 3)
            + " "
            + text.substring(3, 9)
            + " "
            + text.substring(9, 10).toLowerCase()
            + text.substring(10, 17);
*/
    System.out.println(result);
}
}
