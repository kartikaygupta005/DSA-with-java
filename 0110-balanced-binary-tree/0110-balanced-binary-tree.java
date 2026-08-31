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

    public boolean isBalanced(TreeNode root) {

        if (root == null) {
            return true;
        }

        int left = recursionleft(root.left);
        int right = recursionright(root.right);

        if (Math.abs(left - right) > 1) {
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);
    }

    private static int recursionleft(TreeNode root) {

        if (root == null) {
            return 0;
        }

        return 1 + Math.max(recursionleft(root.left), recursionleft(root.right));
    }

    private static int recursionright(TreeNode root) {

        if (root == null) {
            return 0;
        }

        return 1 + Math.max(recursionright(root.left), recursionright(root.right));
    }

}