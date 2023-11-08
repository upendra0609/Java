package com.sikku.collection.list;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        v.addElement(12);
        v.add(2);
        v.add(1,20);
        v.add(null);
//        v.remove(0);

        System.out.println(v);

        System.out.println(v.capacity());


    }
}
