package com.sikku.pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsPrime {
    public static void main(String[] args) throws IOException {
        boolean isPrime = true;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number:");
        int num = Integer.parseInt(br.readLine());

        if (num == 2) {
            System.out.println(num + " is prime number");
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.println(isPrime ? num + " is prime" : num + " is not a prime");
        }

    }
}
