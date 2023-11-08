package com.sikku.pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DSA02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("How many Number you want to enter: ");
        int n = Integer.parseInt(br.readLine());

        int maxNum =0;

        while(n>0){
            System.out.println("Enter num: ");
            int num = Integer.parseInt(br.readLine());
            maxNum = Math.max(maxNum, num);
            n--;
        }
        System.out.println("largest number : "+maxNum);
    }
}
