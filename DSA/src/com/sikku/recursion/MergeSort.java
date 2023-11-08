package com.sikku.recursion;

public class MergeSort {
    public static void main(String[] args) {

        int[] ar = {5, 1, 3, 8, 6, 4, 2};
        mergeSort(ar, 0, ar.length - 1);

        for (int i : ar) {
            System.out.println(i);
        }

    }

    public static void mergeSort(int[] ar, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSort(ar, start, mid);
        mergeSort(ar, mid + 1, end);
        merge(ar, start, end);

    }

    public static void merge(int[] ar, int start, int end) {
        int[] newArray = new int[end - start + 1];

        int p = 0; //new array index
        int mid = (start + end) / 2;

        int i = start, j = mid + 1;

        while (i <= mid && j <= end) {
            if (ar[i] < ar[j]) {
                newArray[p] = ar[i];
                i++;
            } else {
                newArray[p] = ar[j];
                j++;
            }
            p++;
        }

        //checking if more number present in either left or right side
        while (i <= mid) {
            newArray[p] = ar[i];
            i++;
            p++;
        }

        while (j <= end) {
            newArray[p] = ar[j];
            j++;
            p++;
        }

        //copying in original array
        for (int x = 0; x < newArray.length; x++) {
            ar[start + x] = newArray[x];
        }
    }

}
