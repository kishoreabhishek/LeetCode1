package org.example;

import java.util.HashSet;

public class Solution {
    public int numIslands(char[][] grid) {
        HashSet<String> visited = new HashSet<>();
        int cnt=0;
        for(int i=0;i<grid.length;i++){
            for (int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                    cnt=cnt+DFS(grid,i,j,visited);
                }
            }
        }
        return cnt;
    }
    private int DFS(char[][]grid,int i,int j,HashSet<String> visited){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]=='0')
            return 0;

        if(visited.contains(i+ ","+j)){
            return 0;
        }
        else{
            visited.add(i+","+j);
            DFS(grid,i+1,j,visited);
            DFS(grid,i-1,j,visited);
            DFS(grid,i,j-1,visited);
            DFS(grid,i,j+1,visited);
            return 1;
        }
    }
}
