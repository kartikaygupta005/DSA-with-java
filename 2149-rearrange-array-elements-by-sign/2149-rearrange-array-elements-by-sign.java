class Solution {
    public int[] rearrangeArray(int[] nums) {
        int len = nums.length ;
        int min = Math.abs(len/2);
        // int[] plus = new int[min];
        // int[] mins = new int[min];
        // int[] final = new int[len];
        ArrayList<Integer> plus = new ArrayList<>();
        ArrayList<Integer> minus = new ArrayList<>();
        ArrayList<Integer> finall = new ArrayList<>();
        for(int i = 0 ; i < len ; i++){
            if(nums[i] > 0){
                plus.add(nums[i]);
            }
            else{
                minus.add(nums[i]);
            }
        }
        for (int j = 0; j < plus.size(); j++) {
            finall.add(plus.get(j));
            finall.add(minus.get(j));
        }
        int[] result = new int[len];
        for(int k = 0 ; k  < finall.size() ; k++){
            result[k] = finall.get(k);
        }
        return  result ; 
    }
}