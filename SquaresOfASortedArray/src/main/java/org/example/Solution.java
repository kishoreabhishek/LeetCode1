//package org.example;
//
//public class Solution {
//    public int[] sortedSquares(int[] nums) {
//        int[] r = new int[nums.length];
//        int min= nums[0];
//        int last = nums[nums.length-1];
//        if(min>=0 || nums.length==1) {
//            for(int i:nums){
//                r[i]=nums[i]*nums[i];
//            }
//            return r;
//        }
//        if(last<=0){
//            for(int j=nums.length-1;j>=0;j--){
//                r[(nums.length)-1-j]=nums[j]*nums[j];
//            }
//            return r;
//        }
//        int minindex=0;
//        for(int i=0;i<nums.length;i++){
//            if(i>0 && Math.abs(nums[i])>Math.abs(nums[i-1])) {
//                minindex=i-1;
//                break;
//            }
//        }
//
//
//    }
//}
