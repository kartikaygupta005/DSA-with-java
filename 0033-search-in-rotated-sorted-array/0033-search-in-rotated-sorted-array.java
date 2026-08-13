class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int[] copyy = Arrays.copyOf(nums, len);

        int index1 = -1;

        if (len == 1) {
            if (nums[0] == target) {
                return 0;
            }
            return -1;
        }

        for (int i = 0; i < len; i++) {
            if (copyy[i] == target) {
                index1 = i;
                break;
            }
        }

        if (index1 == -1) {
            return -1;
        }

        return index1;
    }
}