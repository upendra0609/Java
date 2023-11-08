package com.sikku.recursion;

public class SumOfArray {
    public static void main(String[] args) {

        System.out.println(sum(new int[]{5, 2, 3, 4, 5}));


    }

    public static int sum(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }

        int[] smallArray = new int[arr.length - 1];

        for (int i = 1; i <= smallArray.length; i++) {
            smallArray[i - 1] = arr[i];
        }
        return sum(smallArray) + arr[0];
    }
}
