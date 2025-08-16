package org.example;

import java.text.MessageFormat;

public class Main {
    public static void main(String[] args) {
        Solution s =new Solution();
        int[] r = s.twoSum(new int[]{5,25,75},100);
        System.out.println(r[0]+","+r[1]);
    }
}