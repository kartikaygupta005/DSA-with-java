class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        backtrack(nums , path , result);
        return result;
    }
    private void backtrack(int[] nums , List<Integer> path , List<List<Integer>> result){
        if(path.size() == nums.length){
            result.add(new ArrayList(path));
        }

        for(int num : nums){
            if(!path.contains(num)){
                path.add(num);
                backtrack( nums, path , result);
                path.remove(path.size() -1 );
            }
        }
    }
}