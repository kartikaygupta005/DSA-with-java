class Solution {
    public int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        int diff = len - k ;
        Arrays.sort(nums);
        return nums[diff];
    }
}