package com.sikku.recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    public static int fact(int n){

        int smallAns = 0;
        if(n==0){
            return 1;
        }
        smallAns = fact(n-1);

        return n*smallAns;
    }
}
