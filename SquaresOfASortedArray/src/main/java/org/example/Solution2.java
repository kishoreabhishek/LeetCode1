package org.example;

public class Solution2 {
    public int[] sortedSquares(int[] nums) {
        int first = 0;
        int last = nums.length-1;
        if(first==last){
            nums[0]=nums[0]* nums[0];
            return nums;
        }
        int[] r = new int[nums.length];
        int j=nums.length-1;
        for(int i=0;i<nums.length;i++){

            if(Math.abs(nums[first])>Math.abs(nums[last])){
                r[j] = nums[first]*nums[first];
                first=first+1;
            }
            else {
                r[j] = nums[last] * nums[last];
                last = last - 1;
            }
            j=j-1;

        }
        return r;
    }
}
