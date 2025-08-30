package org.example;

public class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode currentNode;
        ListNode parentNode = null;
        currentNode = head;
        ListNode subHead =null;
        ListNode parentSubhead = null;
        boolean headChanged = false;
        int cnt=1;
        while(currentNode !=null){
            if(cnt<left) {
                parentNode = currentNode;
                currentNode = currentNode.next;
            }
            else if(cnt == left){
                if(currentNode == head)
                    headChanged = true;
                subHead = currentNode;
                parentSubhead = parentNode;
                parentNode = currentNode;
                currentNode = currentNode.next;

            }
            else if(cnt<=right){
                ListNode tCurrent = currentNode.next;
                currentNode.next = parentNode;
                parentNode = currentNode;
                if(cnt==right){
                    if(parentSubhead != null)
                        parentSubhead.next = currentNode;
                    parentNode = subHead;
                    parentNode.next = tCurrent;
                    if (headChanged)
                        head = currentNode;
                }
                currentNode = tCurrent;


            }
            else{
                currentNode = currentNode.next;
            }
            cnt++;
        }
        return head;

    }
}
