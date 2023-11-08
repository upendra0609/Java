package com.sikku;

public class NextPermutation {

    public static int nextGreaterPermutation(int num){
        String numStr = ""+num;
        int[] numArr =new int[numStr.length()];



        for (int i=numArr.length-1; i>0; i--){

            for (int p=0; p<numStr.length(); p++){
                numArr[p] =Integer.parseInt(String.valueOf(numStr.charAt(p)));
            }
            int temp = numArr[i];
            numArr[i] = numArr[i-1];
            numArr[i-1] = temp;

            StringBuilder newNumber = new StringBuilder();
            for (int j: numArr){
                newNumber.append(j);
            }
            if(num<Integer.parseInt(newNumber.toString())){
                return Integer.parseInt(newNumber.toString());
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        System.out.println(nextGreaterPermutation(11121));
        System.out.println(nextGreaterPermutation(12453));
        System.out.println(nextGreaterPermutation(123));
    }
}
