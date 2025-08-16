package org.example;

import java.util.HashSet;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> s = new HashSet<>();
        if(nums.length<=1)
            return false;
        if(k==0)
            return false;
        int j=1;
        int l=0;
        s.add(nums[0]);

        while(j<nums.length){
            if(j-l<=k ){
                if(s.contains(nums[j]))
                    return true;
                else{
                    s.add(nums[j]);

                }

            }
            j=j+1;

            if(j-l>k){
                s.remove(nums[l]);
                l=l+1;

            }
        }
        return false;

    }
}
