package com.sikku.map;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Temp, String> m = new Hashtable<Temp, String>();

        m.put(new Temp(1),"AAA");
        m.put(new Temp(2),"BBB");
        m.put(new Temp(3),"CCC");
        m.put(new Temp(4),"DDD");
        m.put(new Temp(5),"EEE");
        System.out.println(m);

    }
}

class Temp {
    int i;

    public Temp(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return String.valueOf(i);
    }

    @Override
    public int hashCode() {
        return i;
    }
}
