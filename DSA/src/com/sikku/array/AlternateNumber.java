package com.sikku.array;

import java.util.Scanner;

public class AlternateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i <= (arr.length)/2; i++) {


            if (start <=(arr.length/2)) {
                System.out.println("Enter value");
                arr[start] = sc.nextInt();
                start++;
            }

            if (end > arr.length / 2) {
                System.out.println("Enter value");
                arr[end] = sc.nextInt();
                end--;
            }
        }

        for (int i:arr){
            System.out.println(i);
        }

    }
}
