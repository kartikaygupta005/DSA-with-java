class Solution {
    public int findMin(int[] nums) {
        //int min_num = 0 ;
        Arrays.sort(nums);
        return nums[0];
        
    }
}