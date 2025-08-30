package org.example;

import java.util.List;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode cnode=null;
        ListNode current = null;
        ListNode pnode = null;
        boolean f = false;
        if(head == null || head.next==null)
            return head;
        while(true){
            if(!f){
                pnode =head;
                cnode = head.next;
                head.next=null;
                f=true;
            }
            else{
                current = cnode;
                cnode = current.next;
                if(cnode!=null) {
                    current.next = pnode;
                    pnode = current;
                }
                else{
                    head=current;
                    head.next = pnode;
                    break;
                }
            }


        }
        return head;
    }

}
