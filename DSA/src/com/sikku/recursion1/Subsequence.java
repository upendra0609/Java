package com.sikku.recursion1;

public class Subsequence {
    public static String[] subseq(String str) {
        if (str.length() == 0) {
            return new String[]{""};
        }

        String[] str1 = subseq(str.substring(1));
        String[] newStr = new String[str1.length * 2];

        for (int i = 0; i < str1.length; i++) {
            newStr[i] = str1[i];
        }

        for (int i = 0; i < str1.length; i++) {
            newStr[i + str1.length] = str.charAt(0) + str1[i];
        }
        return newStr;

    }

    public static void main(String[] args) {
        String[] s = subseq("aaa ");
        System.out.println(s.length);


        for (String s1 : s) {
            System.out.println(s1);
        }
    }
}
