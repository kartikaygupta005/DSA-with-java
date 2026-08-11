class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer > map = new HashMap<>();
        int[] answer = new int[k];
        for(int i : nums ){
            map.put(i , map.getOrDefault(i , 0 ) +1 );
        }
        int index = 0 ;
        while(index < k ){
            int maxFreq = 0 ;
            int maxElement = 0 ;
            for(int key : map.keySet()){
                if(map.get(key) > maxFreq){
                    maxFreq = map.get(key);
                    maxElement = key ; 
                }
            }
            answer[index] = maxElement ;
            index++;
            map.remove(maxElement);
        }
        return answer ; 
    }
}