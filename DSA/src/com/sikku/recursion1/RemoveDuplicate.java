package com.sikku.recursion1;

public class RemoveDuplicate {

    public static String remove(String str) {
        if (str.length() == 1) {
            return str;
        }

        String newString = remove(str.substring(1));

        if(!newString.contains(str.substring(0,1))){
            newString = str.substring(0,1) + newString;
        }
        return newString;

    }

    public static void main(String[] args) {
        System.out.println(remove("aaadajaajajah"));

    }
}
