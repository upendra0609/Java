package com.sikku.pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DSA01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter n = ");
        int n = Integer.parseInt(br.readLine());

        for(int i=1; i<=n; i++){
            System.out.println(i);
        }
        int i = 1;
        while(i<=n){
            System.out.println(i);
            i++;

        }


    }
}
