package com.sikku.pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern01 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter value of n:");
        int n = Integer.parseInt(br.readLine());

        int i = 1;
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print((char) ('A'+n-i+j));
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
