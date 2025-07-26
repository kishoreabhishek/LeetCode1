package org.example;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.minTimeToVisitAllPoints(new int[][]{{1,1},{3,4},{-1,0}}));
        System.out.println(s.minTimeToVisitAllPoints(new int[][]{{3,2},{-2,2}}));
    }
}