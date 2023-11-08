package com.sikku.collection.arraylist;

import java.util.ArrayList;

public class RemoveDuplicate {
    public static ArrayList<Integer> remove(int[] ar){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(ar[0]);

        for (int i=1; i<ar.length;i++){
            if(ar[i-1] != ar[i]){
                al.add(ar[i]);
            }
        }
        return al;
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = remove(new int[]{10,10,20,20,20,30,40,10,10});
        for (int i: al){
            System.out.println(i);
        }
    }
}
