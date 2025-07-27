package org.example;

import java.util.Arrays;

public class Solution2 {
    public void moveZeroes(int[] nums) {
        int lp=nums.length-1;
        for(int i= nums.length-1;i>=0;i--){

            if(nums[i]!=0){
                lp=Math.min(i-1,lp);
                while(lp>=0 && nums[lp]!=0 ){
                    lp=lp-1;
                }
                if(lp<0)
                    break;
                int tlp=lp;
                while(lp<i){
                    nums[lp]=nums[lp+1];
                    nums[lp+1]=0;
                    lp=lp+1;
                }
                lp=tlp-1;
            }

        }
        System.out.println(Arrays.stream(nums).mapToObj(Integer::toString).reduce("",(m, n)->m+n+","));
    }
}
