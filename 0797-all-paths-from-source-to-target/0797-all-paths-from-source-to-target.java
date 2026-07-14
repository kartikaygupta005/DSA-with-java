import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();
        
        // Start exploring from the source node (0)
        currentPath.add(0);
        dfs(0, graph, currentPath, results);
        
        return results;
    }
    
    private void dfs(int node, int[][] graph, List<Integer> currentPath, List<List<Integer>> results) {
        // Base Case: If we reach the target node (n - 1), save a copy of the path
        if (node == graph.length - 1) {
            results.add(new ArrayList<>(currentPath));
            return;
        }
        
        // Traverse all the valid next steps (neighbors) from the current node
        for (int neighbor : graph[node]) {
            // 1. Choose: add the neighbor to the path
            currentPath.add(neighbor);
            
            // 2. Explore: recursively find paths from this neighbor
            dfs(neighbor, graph, currentPath, results);
            
            // 3. Backtrack: remove the neighbor to try other options
            currentPath.remove(currentPath.size() - 1);
        }
    }
}