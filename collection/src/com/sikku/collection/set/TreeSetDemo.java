package com.sikku.collection.set;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();
        System.out.println(t.comparator());

        t.add(null);   //not allowed

        t.add(12);
        System.out.println(t);


//        TreeSet t1 = new TreeSet<>((I1, I2)->{
//            return 1;
//        });
//
//        t1.add("AA");
//        t1.add(12);
//
//        System.out.println(t1);
    }
}
