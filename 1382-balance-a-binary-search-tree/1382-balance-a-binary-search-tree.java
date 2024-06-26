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
    public void inordert(TreeNode root,ArrayList<Integer> inorderList){
        if(root==null){
            return;
        }
        inordert(root.left,inorderList);
        inorderList.add(root.val);
        inordert(root.right,inorderList);
    }
    public TreeNode construct(ArrayList<Integer> al,int start,int end){
        if(start>end){
            return null;
        }
        int mid = start + (end-start)/2;
        TreeNode root = new TreeNode(al.get(mid));
        root.left = construct(al,start,mid-1);
        root.right =construct(al,mid+1,end);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> al = new ArrayList<>();
        inordert(root,al);
        return construct(al,0,al.size()-1);
        
    }
}