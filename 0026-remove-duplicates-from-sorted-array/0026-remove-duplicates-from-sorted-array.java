class Solution {
    public int removeDuplicates(int[] nums) {
        int[] copy = new int[nums.length];
        int j = 0;

        copy[j] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (copy[j] != nums[i]) {
                j++;
                copy[j] = nums[i];
            }
        }

        for (int i = 0; i <= j; i++) {
            nums[i] = copy[i];
        }

        return j + 1;
    }
}