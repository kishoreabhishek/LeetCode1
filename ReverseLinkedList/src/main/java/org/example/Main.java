package org.example;

public class Main {
    public static void main(String[] args) {
        ListNode head = null;
        ListNode p = null;
        for(int i=1;i<=20;i++){
            ListNode n = new ListNode(i);
            if(i==1){
                head = n;
                p = head;
            }
            else {
                p.next = n;
                p=n;
            }
        }
        Solution s = new Solution();
        ListNode ln = s.reverseList(head);
        while(ln!=null){
            System.out.println(ln.val);
            ln=ln.next;
        }
    }

}