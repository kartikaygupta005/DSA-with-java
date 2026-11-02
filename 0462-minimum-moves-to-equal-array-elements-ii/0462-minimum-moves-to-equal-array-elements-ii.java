class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = nums.length / 2 ; 
        int moves = 0 ;
        for(int i = 0 ; i  < mid ; i++){
            moves += nums[mid] - nums[i];
        }
        for(int i = mid ; i < nums.length ; i++){
            moves += nums[i] - nums[mid];

        }
        return moves ; 
    }
}