package org.example;

import java.util.Arrays;

public class Solution4 {
    public void moveZeroes(int[] nums) {
        int lp=0;
        int rp=0;
        for(int i=0;i< nums.length;i++){
            if(nums[lp]!=0){
                lp=lp+1;
            }
            if(nums[rp]==0 || rp<lp){
                rp=rp+1;
            }
            if(rp<nums.length && lp<nums.length && nums[rp]!=0 && nums[lp]==0 && lp < rp){
                nums[lp]=nums[rp];
                nums[rp]=0;

            }

        }
        System.out.println(Arrays.stream(nums).mapToObj(Integer::toString).reduce("",(m, n)->m+n+","));
    }
}
