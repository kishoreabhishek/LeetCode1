package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
    List<Integer> r = new ArrayList<>();
    char[] dir = new char[]{'r','d','l','u'};
    HashSet<String> visited = new HashSet<>();
    public List<Integer> spiralOrder(int[][] matrix) {

        int length = matrix.length;
        int width = matrix[0].length;
        int totalPoints = length*width;
        int x=0;
        int y=0;
        int j=0;
        char currdir = dir[j];
        int i=0;
        int tempx=0;
        int tempy=0;
        r.add(matrix[x][y]);
        visited.add(x+","+y);
        while(i<totalPoints ){

            if(currdir == 'r'){
                tempy = y+1;
            } else if (currdir=='l') {
                tempy = y-1;
            }
            else if (currdir=='u') {
                tempx = x-1;
            }
            else{
                tempx = x+1;
            }
            if(tempx == length || tempx<0 || tempy <0 || tempy == width ||
                    visited.contains(tempx+","+tempy)){
                j=(j+1)%4;
                currdir = dir[j];
                tempx=x;
                tempy=y;
                if(currdir == 'r'){
                    tempy = y+1;
                } else if (currdir=='l') {
                    tempy = y-1;
                }
                else if (currdir=='u') {
                    tempx = x-1;
                }
                else{
                    tempx = x+1;
                }
            }
            if(tempx != length && tempx>=0 && tempy >=0 && tempy != width) {
                x = tempx;
                y = tempy;
            }
            if(!visited.contains(x+","+y)) {
                r.add(matrix[x][y]);
                visited.add(x + "," + y);
            }
            i=i+1;
        }
        return r;
    }

}
