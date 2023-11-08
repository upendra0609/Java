package com.sikku.oops.inheritence.pack3;

public class Main {
    public static void main(String[] args) {
        Parent p = new Child();
        p.print();
        p.m1();

        Child c = new Child();
        c.print();
        c.m1();

    }
}
