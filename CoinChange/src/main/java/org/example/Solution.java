package org.example;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    Map<Integer,Integer> memo = new HashMap<>();

    public int coinChange(int[] coins, int amount) {

        int minres = Integer.MAX_VALUE;
        if(amount==0)
            return 0;
        for(int coin:coins){
            int target = amount-coin;
            if(target>=0){
                int tresult;
                if(memo.containsKey(target))
                    tresult = memo.get(target);
                else
                    tresult = coinChange(coins,target);
                if(tresult >=0 && tresult<minres){
                    minres=tresult;
                }
            }

        }
        if(minres == Integer.MAX_VALUE) {
            memo.put(amount, -1);
            return -1;
        }
        else {
            memo.put(amount, minres + 1);
            return minres + 1;
        }
    }
}
