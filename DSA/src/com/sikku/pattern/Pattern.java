package com.sikku.pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter n :");
        int n = Integer.parseInt(br.readLine());


//        int i = 1;
//        while (i <= n) {
//            int j = 1;
//            while (j <= n) {
//                System.out.print(i);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        int i = 1;
//        while (i <= n) {
//            int j = 1;
//            while (j <= n) {
//                System.out.print(j);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        int i = 1;
//        while (i <= n) {
//            int j = n;
//            while (j > 0) {
//                System.out.print(j);
//                j--;
//            }
//            System.out.println();
//            i++;
//        }

//        int i = 1;
//        while (i <= n) {
//            int j = 1;
//            while (j <= n) {
//                System.out.print(n-j+1);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        int i = 1;
//        char ch = 'A';
//        while (i <= n) {
//            int j = n;
//            char ch1 = ch;
//            while (j > 0) {
//                System.out.print((ch1++));
//                j--;
//            }
//            ch++;
//            System.out.println();
//            i++;
//        }

//        int i = 1;
//        while (i <= n) {
//            int j = n;
//            char ch = (char)('A'+i-1);
//            while (j > 0) {
//                System.out.print(ch++);
//                j--;
//            }
//            System.out.println();
//            i++;
//        }

//        int i = 1;
//        while (i <= n) {
//            int j = 1;
//            char ch = (char)('A'+i-1);
//            while (j <=i) {
//                System.out.print(ch);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }


        int i= 1;

        while (i<=n){
            int j=1;
            while (j<=i){
                System.out.print((char) ('A'+n-i+j-1));
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
