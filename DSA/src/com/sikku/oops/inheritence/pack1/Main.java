package com.sikku.oops.inheritence.pack1;

import com.sikku.oops.inheritence.pack1.Car;

public class Main {
    public static void main(String[] args) {

    }

    public static void m1(){
        System.out.println("m1()");
    }
    public static void m1(int num){
        System.out.println("m1(int num)");
    }

    public final void m2(){
        System.out.println("m2()");
    }

    public void m2(int num){
        System.out.println("m2(int num)");
    }
}
