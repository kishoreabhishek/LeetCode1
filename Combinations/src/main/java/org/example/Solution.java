package org.example;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> r = new ArrayList<>();
        for(int i=1;i<=n-k+1;i++){
            List<List<Integer>> tr=createCombinationList(i,n,k);
            r.addAll(tr);
        }
        return r;
    }

    List<List<Integer>> createCombinationList(int in,int n,int k){
        List<List<Integer>> tr=new ArrayList<>();
        if(k==1) {
            List<Integer> l = new ArrayList<>();
            l.add(in);
            tr.add(l);
            return tr;
        }
        for(int i=in+1;i<=n;i++){
            if(n-k>=0){
                List<List<Integer>> tl = createCombinationList(i,n,k-1);
                for (List<Integer> l : tl) {
                        l.add(in);
                }
                tr.addAll(tl);
            }
        }
        return tr;
    }
}
