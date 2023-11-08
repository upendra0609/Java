package com.sikku.pattern;

import java.util.Scanner;

public class Pattern06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();

        int n1=(n+1)/2;
        int n2 = n-n1;

        int i=1;
        while (i<=n1){
            int space=1;
            while (space<=n1-i){
                System.out.print(" ");
                space++;
            }
            int star = 1;
            while (star<=(2*i)-1){
                System.out.print("*");
                star++;
            }
            System.out.println();
            i++;
        }
        i=1;
        while (i<=n2){
            int space = 1;
            while (space<=i){
                System.out.print(" ");
                space++;
            }
            int star = 1;
            while (star<=n-(2*i)){
                System.out.print("*");
                star++;
            }
            System.out.println();
            i++;
        }
    }
}
