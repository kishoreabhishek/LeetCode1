package org.example;

public class Main {
    public static void main(String[] args) {
        char[][] grid = new char[][]{
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        Solution s= new Solution();
        System.out.println(s.numIslands(grid));
    }
}