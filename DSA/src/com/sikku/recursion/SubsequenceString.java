package com.sikku.recursion;

import java.util.Arrays;

public class SubsequenceString {
    public static void main(String[] args) {
        String []ar = sub("xyz");
        for (String s: ar){
            System.out.println(s);
        }

    }

    public static String[] sub(String str) {
        if (str.length() == 0) {
            return new String[]{""};
        }

        String[] smallAns = sub(str.substring(1));

        String[] ans = new String[smallAns.length * 2];

        for (int i=0;i<smallAns.length;i++){
            ans[i] = smallAns[i];
        }


        for (int i=0; i<smallAns.length;i++){
            ans[i+smallAns.length] = smallAns[i]+str.charAt(0);
        }

        return ans;
    }
}
