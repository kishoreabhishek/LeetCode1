package org.example;

import java.util.*;

public class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] cnums = nums.clone();
        int[] ans = new int[nums.length];
        HashMap<Integer, Stack<Integer>> ni = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(ni.containsKey(nums[i])){
                ni.get(nums[i]).push(i);
            }
            else
            {
                Stack<Integer> s = new Stack<>();
                s.push(i);
                ni.put(nums[i],s);
            }
        }
        Arrays.sort(cnums);
        int temp=0;
        for(int i=0;i<cnums.length;i++){
            int ansindex = ni.get(cnums[i]).pop();

            if(i>0)
            {
                if(cnums[i]!=cnums[i-1]){
                    ans[ansindex]=i;
                    temp=i;
                }
                else{
                    ans[ansindex]=temp;
                }
            }
            else{
                ans[ansindex]=temp;

            }
        }
        return ans;
    }
}
