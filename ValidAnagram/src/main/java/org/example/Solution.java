package org.example;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> tchars = new HashMap<>();
        for(char tchar:t.toCharArray()){
            if(tchars.containsKey(tchar)) {
                int c = tchars.get(tchar);
                tchars.put(tchar,c+1);
            }
            else
                tchars.put(tchar,1);
        }
        for(char c:s.toCharArray()){
            if (!tchars.containsKey(c))
                return false;
            else {
                int cnt = tchars.get(c);
                cnt = cnt-1;
                if(cnt ==0)
                    tchars.remove(c);
                else
                    tchars.put(c,cnt);
            }
        }
        return tchars.isEmpty();
    }
}
