package com.sikku.pattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pattern02 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter value of n: ");
        try {
            int n = Integer.parseInt(br.readLine());
            int i=0;
            while (i<n){
                char ch = 'A';
                int j=0;
                while (j<n){
                    System.out.print((char) (ch+i+j));
                    j++;
                }
                System.out.println();
                i++;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
