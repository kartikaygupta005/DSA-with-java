// class Solution {
//     public int findPairs(int[] nums, int k) {
    //     int count = 0 ;
    //     HashSet<Integer> set = new HashSet<>();
    //     for(int i = 0 ; i < nums.length - 1 ; i++){
    //         for(int  j = i+1 ; j < nums.length  ; j++){
    //             if(Math.abs(nums[i] -  nums[j]) == k ){
    //                 if(nums[i] != nums[j]){
    //                     set.add(nums[i]);
    //                     set.add(nums[j]);
    //                 } 
    //             }
    //         }
    //     }
    //     return  set.size()/2  ;
        
    // }

class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0) {
            return 0; 
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
             map.put(n, map.getOrDefault(n, 0) + 1);
        } 
        
        int count = 0; 
        for (int j : map.keySet()) { 
            if (k == 0) {
                if (map.get(j) >= 2) { 
                    count++;
                }
            } else {
                if (map.containsKey(j + k)) {
                    count++;
                }
            }
        }
        return count;
    }
}

    