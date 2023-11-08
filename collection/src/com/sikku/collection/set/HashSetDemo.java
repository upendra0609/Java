package com.sikku.collection.set;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();

        h.add(null);
        h.add(12);
        h.add(null);
        h.add(10);
        h.add(3);
        h.add(1212);

        System.out.println(h.size());

        System.out.println(h);
    }
}
