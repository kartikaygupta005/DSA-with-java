class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0 ;
        int right = nums.length -1 ;
        int finall = 0;
        while(left <= right){
            int mid = left + (right-left)/2 ; 
            if(nums[mid] == target){
                return mid ;
            }
            if (target > nums[nums.length - 1]) {
                return nums.length;
            }
            if (mid > 0 && nums[mid - 1] < target && nums[mid] > target){
                finall = mid ;
                break;
            }
            else if( nums[mid] < target ){
                left = mid + 1 ; 
            }
            else{
                right = mid-1;
            }
//            finall = mid ; 
            
        }
        return finall  ;
         
    }
}