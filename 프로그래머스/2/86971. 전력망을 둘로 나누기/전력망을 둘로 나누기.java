import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        List<Integer>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) graph[i] = new ArrayList<>();
        for (int[] w : wires) {
            graph[w[0]].add(w[1]);
            graph[w[1]].add(w[0]);
        }

        int min = n;

        for (int[] cut : wires) {
            // 전선 하나 끊기
            graph[cut[0]].remove(Integer.valueOf(cut[1]));
            graph[cut[1]].remove(Integer.valueOf(cut[0]));

            boolean[] visited = new boolean[n + 1];
            int count = dfs(graph, visited, cut[0]);

            min = Math.min(min, Math.abs(n - 2 * count));

            // 전선 복구
            graph[cut[0]].add(cut[1]);
            graph[cut[1]].add(cut[0]);
        }

        return min;
    }

    int dfs(List<Integer>[] g, boolean[] v, int cur) {
        v[cur] = true;
        int sum = 1;
        for (int next : g[cur])
            if (!v[next]) sum += dfs(g, v, next);
        return sum;
    }
}
