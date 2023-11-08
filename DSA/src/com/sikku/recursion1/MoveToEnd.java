package com.sikku.recursion1;

public class MoveToEnd {

    public static String move(String str, char ch) {
        if (str.length() == 1) {
            return str;
        }

        String newString = move(str.substring(1), ch);
        if (str.charAt(0) == ch) {
            newString = newString + str.charAt(0);
        } else {
            newString = str.charAt(0) + newString;
        }
        return newString;
    }

    public static void main(String[] args) {
        System.out.println(move("xxxxxaxbcxxdxxxxx", 'x'));

    }
}
