package org.example;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> letterCasePermutation(String s) {
        char[] chars = s.toCharArray();
        return createString(0,chars);
    }
    List<String> createString(int i,char[] chars){
        List<String> res =null;
        if(i==chars.length-1){
            res = new ArrayList<>();
            if(Character.isDigit(chars[i])){
                res.add(chars[i]+"");
            }
            else{
                char c = Character.toLowerCase(chars[i]);
                res.add(c+"");
                res.add(Character.toUpperCase(c) +"");
            }
            return res;
        }
        List<String> sstrings= createString(i+1,chars);

        if(Character.isDigit(chars[i])){
            res = sstrings.stream().map(s->chars[i]+s).toList();
        }
        else{
            res = new ArrayList<>();
            for(String s:sstrings){
                char c = Character.toLowerCase(chars[i]);
                res.add(c+s);
                res.add(Character.toUpperCase(c)+s);
            }
        }
        return res;
    }
}
