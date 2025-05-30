import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = n;
        
        for (int i = 0; i < n - 1; i ++) {
            List<List<Integer>> graph = new ArrayList<>();
            
            for (int j = 0; j < n + 1; j ++) {
                graph.add(new ArrayList<>());
            }
            
            boolean[] visited = new boolean[n + 1];
            
            for (int j = 0; j < n - 1; j ++) {
                if (i == j) continue;
                int a = wires[j][0];
                int b = wires[j][1];
                graph.get(a).add(b);
                graph.get(b).add(a);
            }
            
            int count = dfs(graph, visited, 1);
            int minDiff = Math.abs(count - (n - count));
            answer = Math.min(answer, minDiff);
        }
        
        return answer;
    }
    
    int dfs(List<List<Integer>> graph, boolean[] visited, int start) {
        int count = 1;
        visited[start] = true;
        for (int next : graph.get(start)) {
            if (!visited[next]) {
                count += dfs(graph, visited, next);
            }
        }
        return count;
    }
}