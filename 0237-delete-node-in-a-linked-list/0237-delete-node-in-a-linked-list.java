/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode newNode = node.next;
        node.val = newNode.val;
        node.next = newNode.next;
        //newNode.next = null;
    }
}