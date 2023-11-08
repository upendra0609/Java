package com.sikku.oops.fraction;

public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(2,2);
        Fraction f2 = new Fraction(6,2);
//
//        f1.add(f2);
//
//        System.out.println(f1.getNominator()+"/"+f1.getDenominator());

        Fraction f = Fraction.add(f1,f2);

        System.out.println(f.getNominator()+"/"+f.getDenominator());

    }
}
