package com.sikku.recursion1;

public class StringPermutation {
    public static void printPer(String str, String per){
        if(str.length()==0){
            System.out.println(per);
            return;
        }

        for (int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i)+str.substring(i+1);
            printPer(newStr, per+currChar);
        }
    }

    public static void main(String[] args) {

        printPer("abc","");

    }
}
