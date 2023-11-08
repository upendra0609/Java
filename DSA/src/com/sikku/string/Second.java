package com.sikku.string;

import java.util.Arrays;

public class Second {
    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");
        String str4 = new String("abc");



        System.out.println(str3 == str4);

    }

    public static String reverseString(String str) {
        String revStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            revStr += str.charAt(i);
        }
        return revStr;
    }

    public static boolean checkPalindrome(String str) {

        for (int i = 0; i <= str.length() / 2; i++) {
            if (!(str.charAt(i) == str.charAt(str.length() - 1 - i))) {
                return false;
            }
        }
        return true;
    }
}
