package com.sikku.map;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> m = new HashMap<>();

        m.put(101, "AAA");
        m.put(104, "DDD");
        m.put(103, "CCC");
        m.put(105, "EEE");
        m.put(102, "BBB");
        m.put(null,"xvn");


        Set<Map.Entry<Integer, String>> s = m.entrySet();

        for (Map.Entry<Integer, String> entry : s) {
            System.out.println("Key: " + entry.getKey() + "  Value: " + entry.getValue());
            System.out.println();
        }

    }
}
