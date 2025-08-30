package org.example;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode t = head;
        ListNode p = null;

        while (t!=null){
            if(t.val == val){
                if(t!=head){
                    p.next = t.next;
                    t=t.next;
                }
                else{

                    head = t.next;
                    t=head;

                }

            }
            else{
                p=t;
                t=t.next;
            }


        }
        return head;
    }
}
