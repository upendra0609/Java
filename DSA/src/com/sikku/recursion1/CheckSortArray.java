package com.sikku.recursion1;

public class CheckSortArray {

    public static boolean isSorted(int[] ar) {
        if (ar.length == 1) {
            return true;
        }

        //< for strictly sorted means repeating is not allowed
        if (ar[0] < ar[1]) {
            int[] smallAr = new int[ar.length - 1];
            for (int i = 1; i < ar.length; i++) {
                smallAr[i - 1] = ar[i];

            }
            return isSorted(smallAr);
        }
        return false;
    }

    public static void main(String[] args) {

        int[] ar = {1, 2, 3, 1};
        System.out.println(isSorted(ar));

    }
}
