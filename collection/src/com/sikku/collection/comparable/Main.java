package com.sikku.collection.comparable;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Employee> t = new TreeSet<>();

        t.add(new Employee(1,"AAA"));
        t.add(new Employee(3,"CCC"));
        t.add(new Employee(5,"EEE"));
        t.add(new Employee(4,"DDD"));
        t.add(new Employee(2,"BBB"));

        System.out.println(t);
    }
}
