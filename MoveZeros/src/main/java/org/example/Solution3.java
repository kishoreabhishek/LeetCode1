package org.example;

import java.util.Arrays;

public class Solution3 {
    public void moveZeroes(int[] nums) {
        int rp=0;
        for(int lp=nums.length-1;lp>=0;lp--){
            if(lp==nums.length-1)
                rp=lp;
            if(nums[lp]==0 && lp < rp){
                int tlp=lp;
                while(tlp<rp){
                    nums[tlp]=nums[tlp+1];
                    nums[tlp+1]=0;
                    tlp=tlp+1;
                }
            }
            if(nums[rp]==0){
                rp=rp-1;
            }
        }
        System.out.println(Arrays.stream(nums).mapToObj(Integer::toString).reduce("",(m, n)->m+n+","));
    }
}
