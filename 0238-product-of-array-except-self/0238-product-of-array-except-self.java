class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length ;
        int[] answer = new int[len];
        int product =1 ; 
        for(int i = 0 ; i < len ;i++){
            answer[i] = product ;
            product = product * nums[i];
        }
        product = 1 ;
        for(int i = len -1 ; i >= 0 ;i--){
            answer[i] = answer[i] * product ;
            product = product  * nums[i];


        }
        return answer ; 

        
    }
}