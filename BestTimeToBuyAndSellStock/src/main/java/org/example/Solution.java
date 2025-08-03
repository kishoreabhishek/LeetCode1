package org.example;

public class Solution {
    public int maxProfit(int[] prices) {
        int bp=0;
        int sp=1;
        int profit=0;
        if(sp>=prices.length)
            return 0;
        int minprice = prices[0];
        for(int i=0;i<prices.length;i++){

            if(prices[i]<=minprice){
                bp=i;
                sp=bp+1;
                minprice = prices[i];
            }
            else{
                sp=sp+1;
            }
            if(sp>=prices.length)
                break;
            if(prices[sp]-minprice>profit)
                profit=prices[sp]-minprice;
        }
        return profit;

    }
}
