import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        // 7개 정의
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int n = maps.length;
        int m = maps[0].length;
        int depth = 1;
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];
        
        // 첫 방문 
        queue.add(new int[]{0,0});
        visited[0][0] = true;
        
        // bfs 시작
        while(!queue.isEmpty()) {
            int size = queue.size();
            
            // size만큼 돌리기
            for(int i = 0; i < size; i ++) {
                int[] cur = queue.poll();
                if (cur[0] == n - 1 && cur[1] == m - 1) {
                    return depth;
                }
                
                for (int j = 0; j < 4; j++) {
                    int nx = cur[0] + dx[j];
                    int ny = cur[1] + dy[j];
                    
                    if (nx >= 0 && ny >= 0 && nx < n && ny < m && !visited[nx][ny] && maps[nx][ny] == 1) {
                        queue.add(new int[]{nx, ny});
                        visited[nx][ny] = true;
                    }
                }
                
            }
            depth += 1;
        }
        
        
        int answer = -1;
        return answer;
    }
}