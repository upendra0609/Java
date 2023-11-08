package com.sikku.oops.inheritence.pack2;

import com.sikku.oops.inheritence.pack1.Vehicle;

public class Truck extends Vehicle {

    public void print() {
        System.out.println("Truck");
    }

    public static void main(String[] args) {
//        Vehicle v = new Truck();
//        v.getNum();

//        Truck t = new Truck();
//        t.getNum();

        Truck t = new Truck();
        t.getNum();

    }


}
