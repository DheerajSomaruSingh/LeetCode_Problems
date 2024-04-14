/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        helper(root);
        return sum;
    }

    private void helper(TreeNode node) {
        if (node.left != null) {
            if (node.left.left == null && node.left.right == null) {
                sum += node.left.val;
            } else {
                helper(node.left);
            }
        }
        if (node.right != null) {
            helper(node.right);
        }
    }
}