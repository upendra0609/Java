package com.sikku.array;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] ar = {4, 5, 7, 8, 10, 14, 24, 36, 89};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value to search: ");
        int num = sc.nextInt();
        int start = 0;
        int mid = ar.length / 2;
        int end = ar.length - 1;
        int i = 0;

        while (start <= end) {
            if (num >= ar[mid]) {
                if (num == ar[mid]) {
                    break;
                } else {
                    start = mid + 1;
                }
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }

        if (!(mid < ar.length && mid >= 0)) {
            System.out.println(num + " not found");
        } else {
            System.out.println("found at: " + mid);
        }


    }
}
