package com.sikku.recursion;

public class QuickSort {
    public static void main(String[] args) {
        int[] ar = {5, 8, 7, 2, 3, 1, 32, 0};

        quickSort(ar, 0, ar.length - 1);

        for (int i : ar) {
            System.out.println(i);
        }
    }

    public static void quickSort(int[] ar, int start, int end) {
        if (start >= end) {
            return;
        }


        int pi = separate(ar, start, end);
        quickSort(ar, start, pi - 1);
        quickSort(ar, pi + 1, end);

    }

    public static int separate(int[] ar, int start, int end) {
        int pivotNum = ar[start];
        int counter = 0;


        for (int i = start + 1; i <= end; i++) {
            if (ar[i] <= pivotNum) {
                counter++;
            }
        }

        ar[start] = ar[counter + start];
        ar[counter + start] = pivotNum;

        int i = start, j = end;

        while (i < counter && j > counter) {
            if (ar[i] > pivotNum && ar[j] > pivotNum) {
                j--;
            } else if (ar[i] < pivotNum && ar[j] < pivotNum) {
                i++;
            } else if (ar[i] > pivotNum && ar[j] < pivotNum) {
                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
                i++;
                j--;
            } else if (ar[i] < pivotNum && ar[j] > pivotNum) {
                i++;
                j--;
            }

        }

        return counter + start;
    }
}
