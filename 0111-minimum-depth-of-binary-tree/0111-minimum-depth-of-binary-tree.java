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
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0 ; 
        }
        return recursion(root);
    }
    private static int recursion(TreeNode root){
        if(root == null){
            return 0 ;
        }
        if(root.left == null){
            return 1+ recursion(root.right);
        }
        if(root.right == null ){
            return 1+ recursion(root.left);
        }
        int left = recursion(root.left);
        int right = recursion(root.right);
        return 1 + Math.min(left , right);
    }
}