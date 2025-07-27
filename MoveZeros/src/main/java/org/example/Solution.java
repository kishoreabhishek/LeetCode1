package org.example;

import java.util.Arrays;

public class Solution {
    public void moveZeroes(int[] nums) {
        int fp=0;
        int lp=nums.length-1;
        int cnt=0;
        int rcnt=0;
        boolean notstart=nums[nums.length-1]==0;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==0 && notstart) {
                rcnt=rcnt+1;
            }
            else {
                notstart = false;
            }
            if(!notstart) {
                cnt = cnt + 1;
            }
        }
        if(rcnt== nums.length)
            return;
        for(int j=1;j<=cnt;j++) {

                while (nums[lp] == 0) {
                    lp = lp - 1;
                    if(lp<0)
                        break;
                }
                while (nums[fp] != 0) {
                    fp = fp + 1;
                    if(fp>nums.length-1)
                        break;
                }
                while (fp < lp) {
                    nums[fp] = nums[fp + 1];
                    nums[fp + 1] = 0;
                    fp = fp + 1;
                }
                fp = 0;


        }
        System.out.println(Arrays.stream(nums).mapToObj(Integer::toString).reduce("",(m,n)->m+n+","));
    }
}
