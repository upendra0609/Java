package com.sikku.string;

public class SubString01 {
    public static void main(String[] args) {

        String s = "abcd";
        int size = s.length();
        String[] sArray = new String[(size * (size + 1)) / 2];

        int index = 0;
        int start =0;

        for (int q = 0; q < s.length(); q++) {
            for (int i = start; i < s.length(); i++) {
                String newStr = "";
                for (int j = start; j <= i; j++) {
                    newStr += s.charAt(j);
                }
                sArray[index++] = newStr;
            }
            start++;

        }


        for (String str : sArray) {
            System.out.println(str);
        }
    }
}
