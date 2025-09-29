class Solution {
    static int answer = 0;
    static boolean[] visited;
    
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        answer = 0;
        dfs(k, dungeons, 0);        
        return answer;
    }
    
    void dfs(int k, int[][] dungeons, int count) {
        answer = Math.max(answer, count);        
        for (int i = 0; i < dungeons.length; i++) {
            int minReq = dungeons[i][0];
            int cost = dungeons[i][1];
            
            if (!visited[i] && k >= minReq) {
                visited[i] = true;
                dfs(k - cost, dungeons, count + 1);
                visited[i] = false;
            }
        }
        
    }
}