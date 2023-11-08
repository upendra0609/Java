package com.sikku;

public class Main {

    public static void main(String[] args) {
        primeFactor(8);

    }

    public static void primeFactor(int num) {
        System.out.println(1);
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                while (num % i == 0) {
                    System.out.println(i);
                    num /= i;
                }
            }
        }
    }

    public static boolean isPrime(int num) {
        boolean isPrime = true;
        if (num == 2) {
            return true;
        } else {

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            return isPrime;
        }
    }
}

