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
    public boolean isValidBST(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root , result) ;
        for(int i = 1 ; i < result.size() ; i++){
            if(result.get(i) <= result.get(i-1)){
                return false ;
            }
        }
        return true ;
    }
    private static void inorder(TreeNode root , List<Integer> result){
        if(root == null ){
            return;
        }
        inorder(root.left , result);
        result.add(root.val );
        inorder(root.right, result);
    }
}