class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len = nums.length ;
        int result = Integer.MAX_VALUE ;
        int left = 0 ;
        int total = 0; 
        for(int right  = 0 ; right < len  ; right++ ){
            total  += nums[right];
            while(total >= target){
                result = Math.min(result , right-left+1);
                total = total - nums[left];
                left++;
            }
        }
        if(result == Integer.MAX_VALUE){
            return 0 ;
        }
        else {
            return result;
        }

        
    }
}