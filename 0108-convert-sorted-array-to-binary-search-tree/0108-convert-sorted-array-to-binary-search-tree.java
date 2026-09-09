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
    public TreeNode sortedArrayToBST(int[] nums) {
        int len = nums.length ; 
        int left = len/2  - 1 ; 
        int right = len /2  + 1 ; 
        TreeNode  parentNode = new TreeNode(nums[len/2]);
        parentNode.left = leftPart(left , 0 ,  nums);
        parentNode.right = rightPart( right ,len-1 ,  nums );
        return parentNode ; 
    }
    private TreeNode leftPart( int left ,int start ,  int[] nums){
        if(left < start){
            return null ; 
        }
        int mid = (start + left) / 2 ;
        TreeNode node = new TreeNode(nums[mid]);
        node.left =  leftPart(mid  - 1  , start  , nums);
        node.right =  leftPart(left  , mid+1 , nums);
        return node ; 
        
    }
    private TreeNode rightPart( int right ,int end  ,  int[] nums  ){
        if(right > end){
            return null ; 
        }
        int mid = (right + end) / 2 ;
        TreeNode node = new TreeNode(nums[mid]);
        node.left =  rightPart(  right  , mid - 1 , nums);
        node.right =  rightPart(mid + 1  , end , nums);
        return node ;

    }
}