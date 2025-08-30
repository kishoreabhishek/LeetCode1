package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
    HashSet<Integer> h = new HashSet<>();
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> r = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            List<List<Integer>> rl = createP(i,nums.length,nums);
            r.addAll(rl);
        }
        return r;
    }
    List<List<Integer>> createP(int i,int len,int[] nums){
        List<List<Integer>> rl = new ArrayList<>();
        if(len==1){
            List<Integer> l = new ArrayList<>();
            l.add(nums[i]);
            rl.add(l);
            return rl;
        }
        h.add(nums[i]);
        for(int in=0;in<nums.length;in++){
            if(!h.contains(nums[in])){
                List<List<Integer>> tl = createP(in,len-1,nums);
                for(List<Integer> l:tl)
                {
                    l.add(nums[i]);
                }
                rl.addAll(tl);
            }

        }
        h.remove(nums[i]);
        return rl;
    }
}
