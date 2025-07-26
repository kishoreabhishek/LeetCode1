package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{8,1,2,3,2};
        Solution s = new Solution();
        for(int i:s.smallerNumbersThanCurrent(nums)){
            System.out.println(i);
        }

    }
}