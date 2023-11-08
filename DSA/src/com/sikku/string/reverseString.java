package com.sikku.string;

public class reverseString {
    public static void main(String[] args) {
        String str = "abc def ghit dftygui";
        String[] strArr = str.split(" ");

//        for (int i = 0; i < strArr.length; i++) {
//            for (int j = strArr[i].length() - 1; j >= 0; j--) {
//                System.out.print(strArr[i].charAt(j));
//            }
//            System.out.print(" ");
//        }

//        reverse("abc de f gh");
//
        reverseString(new char[]{'a', 'b','c'});
    }

    public static void reverse(String str){

        String[] strArr = str.split(" ");

        for (int i=strArr.length-1; i>=0; i--){
            System.out.print(strArr[i]+" ");
        }

    }

    public static void reverseString(char[] chArr){
        int j=0;

        for (int i=chArr.length-1; i>=0;i++){
            char ch = chArr[j];
            chArr[j] = chArr[i];
            j++;
        }
    }
}
