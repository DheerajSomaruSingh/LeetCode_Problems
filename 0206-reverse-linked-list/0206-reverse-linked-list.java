/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        /*
        
        //loop
        
        ListNode prev = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode curNext = cur.next;
            cur.next = prev;

            prev = cur;
            cur = curNext;
        }

        return prev;
        */
        
        //recursion
        
        if(head==null || head.next==null){
            return head;
        }
        ListNode newhead = reverseList(head.next);
        head.next.next=head;
        head.next = null;

        return newhead;
    }
}