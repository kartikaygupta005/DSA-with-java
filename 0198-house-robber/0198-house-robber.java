class Solution {
    private  int recursion(int[] nums, int index, int[] memo){
        // base case
        if(index >= nums.length){
            return  0 ;
        }
        if(memo[index] != -1){
            return memo[index];
        }
        int include = nums[index] + recursion(nums , index + 2 , memo);
        int exclude = 0 + recursion(nums, index +1 , memo);

        memo[index] =  Math.max(include, exclude);
        return memo[index];

    }
    public int rob(int[] nums) {
        int index = 0;
        int[] memo = new int[nums.length];
        Arrays.fill(memo,-1);
        int answer = recursion(nums , index , memo);
        return answer ;
    }

}