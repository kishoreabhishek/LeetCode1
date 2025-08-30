package org.example;

public class Main {
    public static void main(String[] args) {
        int[] head = new int[]{7,7,7,7};
        ListNode h = null;
        ListNode p = null;
        for(int i:head){
            ListNode n = new ListNode(i);
            if(h==null){
                h=n;
            }
            if(p!=null){
                p.next=n;
            }
            p=n;
        }
        ListNode t=h;
        while(t!=null){
            System.out.println(t.val);
            t=t.next;
        }
        Solution s = new Solution();
        ListNode sh = s.removeElements(h,7);
        t=sh;
        while(t!=null){
            System.out.println(t.val);
            t=t.next;
        }
    }
}