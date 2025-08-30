package org.example;

public class Main {
    public static void main(String[] args) {
        int[] head = new int[]{5};
        ListNode hNode = null;
        ListNode parentNode = null;
        for(int i:head){
            ListNode n = new ListNode(i);
            if(parentNode != null){
                parentNode.next = n;
            }
            else {
                hNode = n;
            }
            parentNode = n;
        }
        ListNode currNode = null;
        currNode = hNode;
        while(currNode != null){
            System.out.println(currNode.val);
            currNode = currNode.next;
        }
        Solution s = new Solution();
        currNode = s.reverseBetween(hNode,1,1);
        while(currNode != null){
            System.out.println(currNode.val);
            currNode = currNode.next;
        }

    }
}