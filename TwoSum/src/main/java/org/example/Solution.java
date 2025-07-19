package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, List<Integer>> l = new HashMap<>();
        int[] r = new int[2];
        for(int i=0;i<nums.length;i++){
            if(l.containsKey(nums[i])) {
                l.get(nums[i]).add(i);
            }
            else{
                List<Integer> tlist = new ArrayList<Integer>();
                tlist.add(i);
                l.put(nums[i], tlist);
            }
        }
        for(int i=0;i<nums.length;i++){
            int ttarget = target-nums[i];
            if(l.containsKey(ttarget)) {
                if(l.get(ttarget).size()>1)
                {
                       r[0] = l.get(ttarget).get(0);
                       r[1] = l.get(ttarget).get(1);
                       break;
                }
                else{
                    if(l.get(ttarget).get(0)!=i) {
                        r[0] = i;
                        r[1] = l.get(ttarget).get(0);
                        break;
                    }
                }
            }
        }
        return r;
    }
}
