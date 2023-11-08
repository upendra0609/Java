package com.sikku.array;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
//        selectionSort(new int[]{7, 2, 9, 6, 7, 5, 1});
//        bubbleSort(new int[]{7, 2, 9, 6, 7, 5, 1});
//        insertionSort(new int[]{7, 2, 9, 6, 7, 5, 1});

        megreSortedArray();

    }

    public static void selectionSort(int[] ar) {
        int n = ar.length;


        for (int i = 0; i < n - 1; i++) {
            int min = Integer.MAX_VALUE;
            int newIndex = -1;
            for (int j = i; j < n; j++) {
                if (min > ar[j]) {
                    min = ar[j];
                    newIndex = j;
                }
            }
            int temp = ar[i];
            ar[i] = min;
            ar[newIndex] = temp;
        }

        for (int i : ar) {
            System.out.println(i);
        }
    }

    public static void bubbleSort(int[] ar) {

        for (int j = ar.length - 1; j >= 0; j--) {
            for (int i = 0; i < j; i++) {
                if (ar[i + 1] < ar[i]) {
                    int temp = ar[i];
                    ar[i] = ar[i + 1];
                    ar[i + 1] = temp;
                }
            }
        }

        for (int i : ar) {
            System.out.println(i);
        }
    }

    public static void insertionSort(int[] ar) {

        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = i; j >= 0; j--) {
                if (ar[j + 1] < ar[j]) {
                    int temp = ar[j + 1];
                    ar[j + 1] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        for (int i : ar) {
            System.out.println(i);
        }
    }

    public static void megreSortedArray() {
        int[] ar1 = {1, 4};
        int[] ar2 = {3, 5, 9, 10, 12};

        int[] ar3 = new int[ar1.length + ar2.length];

        int i = 0, j = 0, k = 0;

        while (i < ar1.length && j < ar2.length) {
            if (ar1[i] < ar2[j]) {
                ar3[k] = ar1[i];
                i++;
                k++;
            } else {
                ar3[k] = ar2[j];
                j++;
                k++;
            }
        }

        while (i<ar1.length){
            ar3[k] = ar1[i];
            i++;
            k++;
        }

        while (j<ar2.length){
            ar3[k] = ar2[j];
            j++;
            k++;
        }

        for (int x : ar3) {
            System.out.println(x);
        }


    }
}