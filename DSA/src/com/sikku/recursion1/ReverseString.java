package com.sikku.recursion1;

public class ReverseString {

    public static void reverseString(String str){
        if(str.length()==0){
            return;
        }

        System.out.println(str.charAt(str.length()-1));

        reverseString(str.substring(0,str.length()-1));
    }

    public static void main(String[] args) {
        reverseString("abcdefghi");

    }
}
