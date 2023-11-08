package com.sikku.collection.list;


import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();

        l.add(null);
        l.add(null);

        System.out.println(l.set(0,1));
        System.out.println(l.size());
        System.out.println(l);
    }

}
