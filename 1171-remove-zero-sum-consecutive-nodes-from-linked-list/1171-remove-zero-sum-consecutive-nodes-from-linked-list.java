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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummyNode = new ListNode(0); // Create a dummy node to simplify edge cases
        dummyNode.next = head; // Connect the dummy node to the original linked list
        HashMap<Integer, ListNode> map = new HashMap<>();
        map.put(0, dummyNode); // Initialize the map with 0 and the dummy node
        int prefSum = 0;
        ListNode current = head;

        while (current != null) {
            prefSum += current.val;
            if (map.containsKey(prefSum)) {
                // If a prefix sum is found in the map, remove the zero-sum sublist
                ListNode start = map.get(prefSum).next; // Get the start of the zero-sum sublist
                int pf = prefSum;
                ListNode temp = start;
                while (temp != current) {
                    pf += temp.val;
                    map.remove(pf); // Remove the prefixes encountered in the zero-sum sublist
                    temp = temp.next;
                }
                // Remove the zero-sum sublist by connecting the node before the start to the node after the end
                map.get(prefSum).next = current.next;
            } else {
                // Add the current prefix sum and node to the map
                map.put(prefSum, current);
            }
            current = current.next;
        }

        return dummyNode.next; // Return the modified linked list, skipping the dummy node
    }
}