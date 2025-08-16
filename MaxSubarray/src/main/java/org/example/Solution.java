package org.example;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    Map<Integer,Integer> memo= new HashMap<>();
    public int maxSubArray(int[] nums) {

        int r = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int t=0;
            if(memo.containsKey(i))
                t=memo.get(i);
            else
                t= Math.max(nums[i],nums[i]+getmax(i+1,nums));
            if(r<t)
                r=t;

        }
        return r;
    }

    public int getmax(int idx,int[] nums){
        int tr=0;
        if(idx==nums.length-1)
            return nums[idx];
        if(idx>=nums.length)
            return 0;

        int t=0;
        if(memo.containsKey(idx))
            return memo.get(idx);
        else
            t = getmax(idx+1,nums);
        tr = Math.max(nums[idx], t + nums[idx]);
        memo.put(idx,tr);
        return tr;
    }
}
