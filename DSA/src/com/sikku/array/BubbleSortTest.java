package com.sikku.array;

public class BubbleSortTest {
    public static void main(String[] args) {
        int[] ar = {9, 5, 3, 6, 2, 4, 24, 5, 23, 55, 89};
        int temp;


        for (int j = 1; j < ar.length; j++) {
            for (int i = 0; i < ar.length - j; i++) {
                if (ar[i] > ar[i + 1]) {
                    temp = ar[i];
                    ar[i] = ar[i + 1];
                    ar[i + 1] = temp;
                }
            }
        }

        for (int i : ar) {
            System.out.println(i);
        }
    }
}
