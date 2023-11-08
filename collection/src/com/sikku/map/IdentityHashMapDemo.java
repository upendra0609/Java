package com.sikku.map;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        IdentityHashMap<Integer,String> m = new IdentityHashMap<>();

        m.put(new Integer(100),"AAA");
        m.put(new Integer(100),"AAA");
        m.put(null,"AAA");

        int i= 12;
        int j =12;

        m.put(i,"CCC");
        m.put(j,"DDD");



        System.out.println(m);
    }
}
