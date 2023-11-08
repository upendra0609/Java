package com.sikku.array;

import java.util.Scanner;

public class SwapAlternate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int []ar = new int[n];

        for (int i=0; i<ar.length;i++){
            System.out.println("Enter value : ");
            ar[i] = sc.nextInt();
        }

        for(int i=0;i<ar.length-1;i+=2){
            int temp = 0;
                temp = ar[i];
                ar[i] = ar[i+1];
                ar[i+1] = temp;
        }

        for (int i: ar){
            System.out.println(i);
        }
    }
}
