import java.util.*;

class Solution {
    int[] dx = {0, 1, 0, -1};
    int[] dy = {1, 0, -1, 0};
    public int solution(int[][] maps) {
        int mx = maps.length;
        int my = maps[0].length;
        boolean[][] visited = new boolean[mx][my];
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{0, 0});
        visited[0][0] = true;
        
        int[][] dist = new int[mx][my];
        dist[0][0] = 1;
        
        while(!que.isEmpty()) {
            int[] cur = que.poll();
            int x = cur[0];
            int y = cur[1];
            if (x == mx - 1 && y == my - 1) {
                return dist[x][y];
            }
            
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && ny >= 0 && nx < mx && ny < my && maps[nx][ny] == 1 && !visited[nx][ny]) {
                    que.add(new int[]{nx, ny});
                    visited[nx][ny] = true;
                    dist[nx][ny] = dist[x][y] + 1;
                }
            }
        }
        
        return -1;
    }
}