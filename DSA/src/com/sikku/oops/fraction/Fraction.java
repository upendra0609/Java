package com.sikku.oops.fraction;

public class Fraction {
    private int nominator;
    private int denominator;

    public Fraction(int nominator, int denominator) {
        this.nominator = nominator;
        if (denominator == 0) {
            this.denominator = 1;
        }
        this.denominator = denominator;
        simplify();
    }

    public int getNominator() {
        return nominator;
    }

    public void setNominator(int nominator) {
        this.nominator = nominator;
        simplify();
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            this.denominator = 1;
        }
        this.denominator = denominator;
        simplify();
    }

    private void simplify() {
        int min = Math.min(this.nominator, this.denominator);
        int gdc = 1;

        int i = 1;
        while (i <= min) {
            if (nominator % min == 0 && denominator % min == 0) {
                gdc = i;
                i++;
            }
        }
        this.nominator /= gdc;
        this.denominator /= gdc;
    }

    public void add(Fraction f) {
        this.nominator = this.nominator * f.denominator + this.denominator * f.nominator;
        this.denominator = this.denominator * this.denominator;
        simplify();
    }

    public static Fraction add(Fraction f1, Fraction f2) {
        int nominator = f1.nominator * f2.denominator + f1.denominator * f2.nominator;
        int denominator = f1.denominator * f2.denominator;
        return new Fraction(nominator, denominator);
    }
}
