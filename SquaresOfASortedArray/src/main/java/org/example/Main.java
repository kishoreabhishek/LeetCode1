package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution2 s =new Solution2();
        int[] r =s.sortedSquares(new int[]{-7,-3,2,3,11});
        System.out.println(Arrays.stream(r).mapToObj(String::valueOf).reduce("",(x, y)->x+","+y));
    }
}