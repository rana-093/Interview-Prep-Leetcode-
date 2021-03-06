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
    int sum = 0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        sum = 0;
        helper(root, L , R);
        return sum;
    }
    void helper(TreeNode root, int L , int R){
        if(root == null){ return ; }
        if(root.val >= L && root.val <= R){
            sum+=root.val;
        }
        if(root.left!=null){
            helper(root.left, L , R);
        }
        if(root.right!=null){
            helper(root.right, L , R);
        }
    }
}

