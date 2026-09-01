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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum = 0 ; 
        return recursion(root , targetSum, sum);
    }
    private static boolean recursion(TreeNode root , int targetSum , int sum ){
        if(root == null){
            return false ;
        }
        sum += root.val ;
        if(root.left == null && root.right == null ){
            return sum == targetSum ;
        }
        return recursion(root.left , targetSum, sum) || recursion(root.right , targetSum, sum); 
    }
}