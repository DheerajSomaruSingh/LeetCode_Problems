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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = nodelength(head);
        int tilltrav = length-n-1;
        if(tilltrav==-1)return head.next;
        ListNode curr = head;
        while(tilltrav>0){
            curr = curr.next;
            tilltrav--;
        }
        curr.next = curr.next.next;
        return head;
    }
    public int nodelength(ListNode head){
        int f = 0;
        if(head==null)return f;
        ListNode curr = head;
        while(curr!=null){
            curr = curr.next;
            f++;
        }
        return f;
    }
}