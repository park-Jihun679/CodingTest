import java.util.*;

class Solution {
    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        int[][] dist = new int [n][m];
        
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{0,0});
        dist[0][0] = 1;
        
        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int x = cur[0];
            int y = cur[1];
            
            if (x == n - 1 && y == m - 1) {
                return dist[x][y];
            }
            
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if (nx >= 0 && ny >= 0 && nx < n && ny < m && maps[nx][ny] == 1 && dist[nx][ny] == 0) {
                    que.add(new int[]{nx, ny});
                    dist[nx][ny] = dist[x][y] + 1;
                }
                    
                
            }
            
        }
    return -1;
        
    }

}