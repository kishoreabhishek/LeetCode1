package org.example;

import java.util.*;

public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            for(int j=0;j< nums.length;j++){
                if(i!=j){
                    int target = -1*(nums[i]+nums[j]);
                    int r = binarySearch(nums,i,j,target);
                    if(r!=-1){
                        List<Integer> l = new ArrayList<>();
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[r]);
                        Collections.sort(l);
                        if(res.isEmpty()){
                            res.add(l);
                        }
                        else{
                            boolean bfound = false;
                            for(List<Integer> li:res){
                                if(li.equals(l))
                                    bfound=true;

                            }
                            if(!bfound)
                                res.add(l);
                        }
                    }
                }
            }
        }
        return res;
    }
    private int binarySearch(int[] nums,int i,int j,int target){
        int first=0;
        int last = nums.length-1;

        while(first<=last) {
            int mid = (first+last)/2;
            if (nums[mid] == target) {

                if (mid == i || mid == j) {
                    int tmid1 = mid - 1;
                    int tmid2 = mid - 2;
                    int tmid3 = mid - 3;
                    int tmid4 = mid + 1;
                    int tmid5 = mid + 2;
                    int tmid6 = mid + 3;
                    if (tmid1 >= 0 && nums[tmid1] == target && tmid1 != i && tmid1 != j) {
                        return tmid1;
                    }
                    if (tmid2 >= 0 && nums[tmid2] == target && tmid2 != i && tmid2 != j) {
                        return tmid2;
                    }
                    if (tmid3 >= 0 && nums[tmid3] == target && tmid3 != i && tmid3 != j) {
                        return tmid3;
                    }
                    if (tmid4 <= nums.length - 1 && nums[tmid4] == target && tmid4 != i && tmid4 != j) {
                        return tmid4;
                    }
                    if (tmid5 <= nums.length - 1 && nums[tmid5] == target && tmid5 != i && tmid5 != j) {
                        return tmid5;
                    }
                    if (tmid6 <= nums.length - 1 && nums[tmid6] == target && tmid6 != i && tmid6 != j) {
                        return tmid6;
                    }
                }
                else
                    return mid;
            }
            if(nums[mid]<target){
                first = mid+1;
            }
            else
                last=mid-1;
        }
        return -1;
    }
}
