class Solution {
    private  int recursion(int[] nums, int index){
        // base case
        if(index >= nums.length){
            return  0 ;
        }
        int include = nums[index] + recursion(nums , index + 2);
        int exclude = 0 + recursion(nums, index +1 );
        return Math.max(include, exclude);

    }
    public int rob(int[] nums) {
        int index = 0;
        int answer = recursion(nums , index);
        return answer ;
    }

}
