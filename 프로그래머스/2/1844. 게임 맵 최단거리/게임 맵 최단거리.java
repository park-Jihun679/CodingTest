import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        // 초기 값  7개
        int[] dx  = {0, 1, 0, -1};
        int[] dy  = {1, 0, -1, 0};
        int n = maps.length;
        int m = maps[0].length;
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> queue = new LinkedList<>();
        int depth = 1;
        
        // 첫 방문 표시
        queue.add(new int[]{0,0});
        visited[0][0] = true;
        
        // bfs 시작
        while(!queue.isEmpty()) {
            int size = queue.size();
            
            // size 만큼 돌리기 (한 depth)
            for (int i = 0; i < size; i++) {
                int[] cur = queue.poll();
                
                // 도달했다면 depth 반환
                if (cur[0] == n - 1 && cur[1] == m - 1) {
                    return depth;
                }
                
                // 상하좌우 이동 체크
                for(int j = 0; j < 4; j ++) {
                    int nx = cur[0] + dx[j];
                    int ny = cur[1] + dy[j];
                    
                    if (nx >= 0 && ny >= 0 && nx < n && ny < m && maps[nx][ny] == 1 && !visited[nx][ny]) {
                        queue.add(new int[]{nx, ny});
                        visited[nx][ny] = true;
                    }
                    
                }
                
            }
            depth += 1;
        }
        
        
        return -1;
    }
}