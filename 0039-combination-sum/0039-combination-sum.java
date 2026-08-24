class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (candidates.length == 0) {
            return result;
        }
        List<Integer> Arrayss = new ArrayList<>();
        backtrack(candidates, target, result, Arrayss, 0);
        return result;
    }
    private static void backtrack(int[] candidates,int target,List<List<Integer>> result,
            List<Integer> Arrayss,int start) {
        if (target == 0) {
            result.add(new ArrayList<>(Arrayss));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            int num = candidates[i];
            Arrayss.add(num);
            backtrack(candidates, target - num, result, Arrayss, i);
            Arrayss.remove(Arrayss.size() - 1);
        }
    }
}