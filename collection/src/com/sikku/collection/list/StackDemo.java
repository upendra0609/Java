package com.sikku.collection.list;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(12);
        s.push(10);
        System.out.println(s);

        System.out.println(s.search(10));
        System.out.println(s);
    }
}
