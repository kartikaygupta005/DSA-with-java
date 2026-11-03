class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int moves = 0 ; 
        int largest = nums[nums.length - 1]; 
        for(int i = 0 ; i < nums.length - 1 ; i++){
            moves += nums[nums.length - 1 ] - nums[i];
        }
        return moves ; 
    }
}