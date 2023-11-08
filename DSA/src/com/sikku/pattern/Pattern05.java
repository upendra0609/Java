package com.sikku.pattern;

import java.util.Scanner;

public class Pattern05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        int i=1;
        while (i<=n){
            int j=1;
            while (j<=n-i){
                System.out.print(" ");
                j++;
            }
            int k=1;
            int x=1;
            while (k<=i){
                System.out.print(x++);
                k++;
            }

            int p=1;
            int q = i-1;
            while (p<i){
                System.out.print(q--);
                p++;
            }
            System.out.println();
            i++;
        }
    }
}
