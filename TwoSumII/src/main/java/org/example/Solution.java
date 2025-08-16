package org.example;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ttarget;

        for(int i=0;i<numbers.length;i++){
            ttarget = target-numbers[i];
            int r = binarySearch(numbers,ttarget,i);
            if(r!=i && r!=-1){
                return new int[]{i+1,r+1};
            }
        }
        return null;
    }

    private int binarySearch(int[] numbers,int target,int ignore){
        int first=0;
        int last=numbers.length-1;
        while(first<=last){
            int mid = (first+last)/2;
            if (target==numbers[mid]) {
                if(mid==ignore)
                {
                    if(target==numbers[mid+1])
                        return mid+1;
                    else
                        return mid-1;
                }

                return mid;
            }
            if(target<numbers[mid]){
                last = mid-1;
            }
            else
                first = mid+1;
        }
        return -1;
    }
}
