package com.sikku.recursion;

public class ReturnKeypad {
    public static void main(String[] args) {
        String[] s = keyPad(592);


        for (String s1 : s) {
            System.out.println(s1);
        }

        System.out.println(s.length);

    }

    public static String returnChar(int num) {

        switch (num) {
            case 2:
                return "abc";
            case 3:
                return "def";
            case 4:
                return "ghi";
            case 5:
                return "jkl";
            case 6:
                return "mno";
            case 7:
                return "pqrs";
            case 8:
                return "tuv";
            case 9:
                return "wxyz";
            default:
                return "";
        }
    }

    public static String[] keyPad(int num) {
        if (num < 10) {
            String s = returnChar(num);
            String[] sArr = new String[s.length()];
            for (int i = 0; i < sArr.length; i++) {
                sArr[i] = String.valueOf(s.charAt(i));
            }
            return sArr;
        }

        String[] smallAns = keyPad(num / 10);

        String remain = returnChar(num % 10);
        String[] ans = new String[smallAns.length * remain.length()];

        int i = 0;
        int j = 0;
            while (j < smallAns.length && i < ans.length) {
                for (int x = 0; x < remain.length(); x++) {
                    ans[i] = smallAns[j] + remain.charAt(x);
                    i++;
                }
                j++;
            }
        return ans;

    }
}
