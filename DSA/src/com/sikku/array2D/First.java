package com.sikku.array2D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size of rows");
        int rows = Integer.parseInt(br.readLine());

        System.out.println("Enter size of cols");
        int cols = Integer.parseInt(br.readLine());

        int[][] arr = new int[rows][cols];


        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.println("Enter the element of ["+i+"]["+j+"]: ");
                arr[i][j] = Integer.parseInt(br.readLine());
            }
        }

        System.out.println("///////////////////////////////////");
        for (int[] i: arr){
            for (int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
