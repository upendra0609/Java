package com.sikku.string;

public class SubString {
    public static void main(String[] args) {
        String str = "abcdef";

        int size = str.length();
        String[] strArr = new String[(size * (size + 1)) / 2];

        int start = 0;
        int i = 0;
        while (start < str.length()) {
            for (int p = start; p < str.length(); p++) {
                String s = "";
                for (int j = start; j <= p; j++) {
                    s += str.charAt(j);
                }
                strArr[i] = s;
                i++;
            }
            start++;
        }


        for (String s : strArr) {
            System.out.println(s);
        }
    }
}
