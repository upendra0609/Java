package com.sikku.pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter value of n: ");
//        try {
//            int n = Integer.parseInt(br.readLine());
//            int i=0;
//            while (i<n){
//                int j=1;
//                int x=1;
//                while (j<=n){
//                    if((n-(j+i))>0){
//                        System.out.print(" ");
//                    }else {
//                        System.out.print(x++);
//                    }
//                    j++;
//                }
//                System.out.println();
//                i++;
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        int n = Integer.parseInt(br.readLine());;
        int i=1;
        while (i<=n){
            int j=1;
            while (j<=n-i){
                System.out.print(" ");
                j++;
            }

            int k=1;
            int val = 1;
            while (k<=i){
                System.out.print(val++);
                k++;
            }
            System.out.println();
            i++;

        }





    }
}
