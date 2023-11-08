package com.sikku.recursion1;


public class FirstAndLastOccurance {

    public static int first = -1;
    public static int last = -1;

    public static void occurance(String str, char ch, int index) {
        if (str.length() == 0) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        if (str.charAt(0) == ch) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }

        occurance(str.substring(1), ch, index + 1);

    }

    public static void main(String[] args) {
        occurance("sdaahas", 'a', 0);

    }
}
