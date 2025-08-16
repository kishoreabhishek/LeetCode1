package org.example;

import java.util.Arrays;

public class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int sum=0;
        int lbound=0;
        int tlen=0;
        int minlen=Integer.MAX_VALUE;
        for(int i = 0;i< nums.length;i++){
            if(nums[i]==target)
                return 1;
            sum=sum+nums[i];
            if(sum>=target) {
                tlen = findmin(nums, lbound, i, sum, target);
                sum=sum-nums[lbound];
                lbound=lbound+1;

            }

            if(tlen!=0 && tlen<minlen)
                minlen=tlen;
        }
        if(minlen==Integer.MAX_VALUE)
            minlen=0;
        return minlen;
    }
    public int findmin(int[] nums,int lbound, int rbound,int sum,int target){

        int tsum = sum-nums[lbound];
        int tlbound = lbound+1;
        int trbound = rbound;
        if(tsum>target) {
            while (true) {

                if (nums[tlbound] <= nums[rbound]) {
                    if(tsum-nums[tlbound]>=target){
                        tsum = tsum-nums[tlbound];
                        tlbound=tlbound+1;

                    }

                    else{
                        return trbound-tlbound+1;
                    }
                }
                else{
                    if(tsum-nums[trbound]>=target){
                        tsum = tsum-nums[trbound];
                        trbound = trbound-1;

                    }
                    else{
                        return trbound-tlbound+1;
                    }
                }
            }
        }
        if(tsum==target){
            return trbound-tlbound+1;
        }
        return rbound-lbound+1;
    }
}
