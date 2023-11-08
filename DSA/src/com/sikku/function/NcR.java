package com.sikku.function;

public class NcR {
    public static void main(String[] args) {
//        System.out.println(findNcR(5,2));

        System.out.println(465746433%11);


    }

    private static double findNcR(int n, int r) {
        return (double) findFactorial(n) / (findFactorial(r) * findFactorial(n - r));
    }

    private static int findFactorial(int n) {

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
