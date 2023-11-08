package com.sikku.collection.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>();

        for (int i = 0; i < 10; i++) {
            p.offer(i);
        }

//        System.out.println(p);
//
//        p.poll();
//        System.out.println(p);

        custom();

    }

    public static void custom() {
        PriorityQueue<Integer> p = new PriorityQueue<>(14, (I1, I2) -> I2.compareTo(I1));

        for (int i = 0; i < 10; i++) {
            p.offer(i);
        }

        System.out.println(p);
    }
}
