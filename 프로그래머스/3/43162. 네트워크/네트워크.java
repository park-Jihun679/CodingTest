class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] isVisited = new boolean[n];
        
        for(int i = 0; i < n; i++) {
             if(!isVisited[i]) {
                 dfs(i, computers, isVisited);
                 answer ++;
             }
        }
        
        return answer;
    }
    
    void dfs(int target, int[][] computers, boolean[] isVisited) {
        isVisited[target] = true;
        for (int i = 0; i < isVisited.length; i++) {
            if (!isVisited[i] && computers[target][i] == 1) {
                dfs(i, computers, isVisited);
            }
        }
    }
}