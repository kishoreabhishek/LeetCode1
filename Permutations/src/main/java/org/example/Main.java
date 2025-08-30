package org.example;

public class Main {
    public static void main(String[] args) {
        Solution s =new Solution();
        int[] a = new int[]{1,2,3,4,5};
        System.out.println(s.permute(a).size());
        System.out.println(s.permute(a));

    }
}