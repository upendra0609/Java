package com.sikku.collection.comparator;

import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {

        TreeSet<Integer> t = new TreeSet<>((I1,I2)->-I1.compareTo(I2));

        t.add(1);
        t.add(12);
        t.add(2);
        t.add(5);
        System.out.println(t);
    }
}
