package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Integer> r = s.spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}});
        System.out.println(r.stream().map(i->Integer
                .toString(i)).reduce("", (i,j)->i+j+","));
    }
}