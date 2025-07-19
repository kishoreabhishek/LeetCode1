package org.example;

public class Solution {
    public int missingNumber(int[] nums) {
        int r=-1;
        int len = nums.length+1;
        int[] arr = new int[len];
        for(int num:nums){
            arr[num]=1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=1) {
                r = i;
                break;
            }

        }
        return r;
    }

}
