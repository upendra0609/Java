package com.sikku.array2D;

public class LargestColumnSum {
    public static void main(String[] args) {
        int[][] ar= {{1,4,5,6},{2,3,4,3},{6,9,2,7}};

        int max = Integer.MIN_VALUE;

        for (int i=0; i<ar[0].length;i++){
            int newMax = 0;
            for (int j=0; j<ar.length; j++){
                newMax += ar[j][i];

                if(max<newMax){
                    max = newMax;
                }
            }
        }

        System.out.println(max);

    }
}
