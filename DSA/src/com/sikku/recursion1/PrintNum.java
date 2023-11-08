package com.sikku.recursion1;

public class PrintNum {

    public static void print(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num);
        print(num - 1);
    }

    public static int sum(int num) {
        if (num == 1) {
            return num;
        }
        int smallAns = sum(num - 1);
        return smallAns + num;
    }

    public static int fact(int num) {
        if (num == 0) {
            return 1;
        }
        int smallAns = fact(num - 1);
        return smallAns * num;
    }

    public static void fibonacci(int a, int b, int num) {
        if (num == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        a = b;
        b = c;
        fibonacci(a, b, num - 1);
    }

    public static void fibonacci(int num) {
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 8;
        fibonacci(a, b, n - 2);
    }

    public static int nThFibonacci(int n) {
        if (n <= 1) {
            return 1 - n;
        }

        return nThFibonacci(n - 1) + nThFibonacci(n - 2);
    }

    public static int xPowerN(int x, int n) {
        if (n == 1 || n == 0) {    //here 0 is used if anyone wants to calculate power zero  2^0
            return x;
        }

        return x * xPowerN(x, n - 1);
    }

    public static int xPowerN1(int x, int n) {
        if (n == 1 || n == 0) {
            return x;
        }

        if (n % 2 == 0) {
            return xPowerN1(x, n / 2) * xPowerN1(x, n / 2);
        } else {
            return xPowerN1(x, n / 2) * xPowerN1(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        System.out.println(xPowerN(2, 3));
    }
}
