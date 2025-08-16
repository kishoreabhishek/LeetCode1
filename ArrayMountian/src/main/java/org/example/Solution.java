package org.example;

public class Solution {
    public int longestMountain(int[] arr) {
        if(arr.length==0 || arr.length==1)
            return 0;
        int lp=0;
        boolean isPeak=false;
        int maxpeak=0;
        for(int i=0;i<arr.length;i++){
            if(i>0) {
                if((i<arr.length-1 && arr[i]<=arr[i-1] && arr[i]<=arr[i+1]) || (i==arr.length-1 && arr[i]<arr[i-1])){
                    if(lp!=i && isPeak){
                        isPeak=false;

                        if(i-lp+1>maxpeak)
                        {
                            maxpeak = i-lp+1;
                        }
                    }
                    lp=i;
                }

                if (i<arr.length-1 && arr[i]>arr[i-1] && arr[i]>arr[i+1] ) {
                    isPeak = true;
                }


            }
        }
        return maxpeak;
    }
}
