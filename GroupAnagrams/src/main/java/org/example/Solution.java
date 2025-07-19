package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> grp = new HashMap<>();
        List<List<String>> grps = new ArrayList<>();
        for(String str:strs) {
            char[] charArray=str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            if(grp.containsKey(sortedString)){
                grp.get(sortedString).add(str);
            }
            else{
                List<String> s = new ArrayList<>();
                s.add(str);
                grp.put(sortedString,s);
            }
        }
        for(String k:grp.keySet()){
            grps.add(grp.get(k));
        }
        return grps;
    }
}
