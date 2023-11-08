package com.sikku.string;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        System.out.println(x);
        String str = sc.nextLine();
        System.out.println(str+"  "+str.length());
    }
}
