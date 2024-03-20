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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode p = list1;
        ListNode c = p.next;
        for(int i=0;i<a-1;i++){
            p = p.next;
            c = c.next;
        }
        p.next = list2;
        for(int i=0;i<b-a;i++){
            c = c.next;
        }
        while(p.next!=null){
            p = p.next;
        }
        p.next = c.next;

        return list1;
    }
}