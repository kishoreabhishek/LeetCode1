package org.example;

public class Main {
    public static void main(String[] args) {
        String[] strs= new String[]{"eat","tea","tan","ate","nat","bat"};
        Solution s = new Solution();
        System.out.println(s.groupAnagrams(strs));
    }
}