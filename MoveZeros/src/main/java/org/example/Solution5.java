package org.example;

import java.util.Arrays;

public class Solution5 {
    public void moveZeroes(int[] nums) {
        int lp=0;
        int rp=0;
        for(int i=0;i< nums.length;i++){
            if(nums[lp]!=0){
                lp=lp+1;
            }
            if(lp== nums.length)
                break;
            if(nums[lp]==0) {
                if (rp < lp) {
                    rp = lp + 1;
                }

                if (rp<nums.length &&nums[rp] == 0 ) {
                    rp = rp + 1;

                }
                if(rp>=nums.length)
                    break;

                if (rp < nums.length && nums[rp] != 0 ) {
                    nums[lp] = nums[rp];
                    nums[rp] = 0;

                }

            }


        }

    }
}
