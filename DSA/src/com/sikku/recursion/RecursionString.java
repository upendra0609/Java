package com.sikku.recursion;

public class RecursionString {
    public static void main(String[] args) {
//        System.out.println(removeChar("ahxklxhklxsh", 'x'));

        System.out.println(removeCons("aaabbbccdddaaab"));


//        String st = "a";
//        String newSt = st.substring(1);
//        System.out.println(newSt+"  "+ newSt.length());

    }

    public static String removeCons(String str){
        if(str.length()==1){
            return str;
        }
        String newStr = "";
        if(str.charAt(0)!=str.charAt(1)){
            newStr += str.charAt(0);
        }

        String ans = removeCons(str.substring(1));

        return newStr+ans;
    }


    public static String removeChar(String st, char ch) {
        if (st.length() == 0) {
            return st;
        }
        String newString = "";
        if (st.charAt(0) != ch) {
            newString +=st.charAt(0);
        }

        String ans = removeChar(st.substring(1), ch);
        return newString + ans;
    }
}
