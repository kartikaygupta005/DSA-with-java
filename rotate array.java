class Solution {
    public void rotate(int[] nums, int k) {
        for(int i = 0; i < k; i++){
            rotator(nums);
        }
    }

    private static void rotator(int[] nums){
        int[] temp = new int[nums.length];

        temp[0] = nums[nums.length - 1];

        for(int i = 1; i < nums.length; i++){
            temp[i] = nums[i - 1];
        }

        for(int i = 0; i < nums.length; i++){
            nums[i] = temp[i];
        }
    }
}
