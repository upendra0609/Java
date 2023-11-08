package com.sikku.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();

        l.add(12);
        l.add(1);
        l.add(2);
        l.add(4);
        l.add(53);
        l.add(34);
        System.out.println(l + "\n");


        Collections.sort(l, (Integer::compareTo));
        System.out.println(Collections.binarySearch(l,12));
        System.out.println(l);

        Collections.sort(l, (i, j) -> -i.compareTo(j));

        System.out.println(Collections.binarySearch(l,12,(i,j)->-i.compareTo(j)));
        System.out.println(l);


    }
}
