package org.example;

import static java.lang.Math.abs;
import static java.lang.Math.max;

public class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int dist=0;
        for(int i=0;i<points.length;i++){
            if(i<=points.length-2) {
                int[] p1 = points[i];
                int[] p2 = points[i+1];
                int xdist = abs(p2[0]-p1[0]);
                int ydist = abs(p2[1]-p1[1]);
                int finaldist = max(xdist,ydist);
                dist = dist+finaldist;
            }
        }
        return dist;
    }
}
