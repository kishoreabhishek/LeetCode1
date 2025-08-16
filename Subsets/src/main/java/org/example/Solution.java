package org.example;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> r=  createSubsets(0,nums);
        List<Integer> empty = new ArrayList<>();
        r.add(empty);
        return r;
    }
    List<List<Integer>> createSubsets(int i,int[] nums){
        List<List<Integer>> res = null;
        if(i==nums.length-1){
            res = new ArrayList<>();
            List<Integer> r = new ArrayList<>();
            r.add(nums[i]);
            res.add(r);
            return res;
        }
        else{
            res = new ArrayList<>();
            List<Integer> tl = new ArrayList<>();
            tl.add(nums[i]);
            res.add(tl);
            for(List<Integer> l:createSubsets(i+1,nums)){
                res.add(l);
                List<Integer> t = new ArrayList<>();
                t.add(nums[i]);
                t.addAll(l);
                res.add(t);
            }

            return res;
        }
    }
}
