package com.sikku.oops.dynamicArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        DynamicArray d = new DynamicArray();

        System.out.println("size: "+ d.getSize());
        System.out.println(d.isEmpty());

        for (int i=0; i<10;i++){
            d.add(i+1);
        }

        for (int i=0; i<10;i++){
            System.out.println(d.get(i));
        }

        System.out.println("size: "+ d.getSize());
        System.out.println(d.removeLast());

        System.out.println(d.replace(0,12));
        System.out.println(d.isEmpty());



    }
}
