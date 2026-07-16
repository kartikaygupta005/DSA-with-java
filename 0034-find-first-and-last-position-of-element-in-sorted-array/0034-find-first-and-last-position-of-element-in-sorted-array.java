class Solution {
    public int[] searchRange(int[] nums, int target) {

        int n = nums.length;

        int firstIndex = -1;
        int lastIndex = -1;

        for (int i = 0; i < n; i++) {

            if (nums[i] == target) {

                if (firstIndex == -1) {
                    firstIndex = i;
                }

                lastIndex = i;
            }
        }

        return new int[]{firstIndex, lastIndex};
    }
}