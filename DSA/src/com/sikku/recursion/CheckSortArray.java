package com.sikku.recursion;

public class CheckSortArray {
    public static void main(String[] args) {

    }

    public static boolean isSort(int[] ar) {
        if(ar.length<=1){
            return true;
        }

        int [] smallArray = new int[ar.length];

        for (int i=1; i<smallArray.length ;i++){
            smallArray[i-1] = ar[i];
        }


        boolean smallAns = isSort(smallArray);


        if(!smallAns){
            return false;
        }else {
            return ar[0] <= ar[1];
        }


    }
}
