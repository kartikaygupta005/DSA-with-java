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
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true ;
        }
        return check(root.left , root.right);       
    }
    private static boolean check(TreeNode lefter , TreeNode righter){
        if(lefter == null && righter == null ){
            return true ;
        }
        if(lefter == null || righter == null || lefter.val != righter.val){
            return false ;
        }
        return check(lefter.left , righter.right)&& check(lefter.right , righter.left);
    }
}