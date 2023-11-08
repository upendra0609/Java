package com.sikku.pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FtoC {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter tem. in fahrenheit");
        float fah = Float.parseFloat(br.readLine());

        float cel = ((float) 5 /9)*(fah-32);
        System.out.println(cel);
    }
}
