package org.example;

public class Main {
    public static void main(String[] args) {
        String s = "aabbbb";
        String t = "aaaabb";

        Solution so =new Solution();
        System.out.println(so.isAnagram(s,t));
    }
}