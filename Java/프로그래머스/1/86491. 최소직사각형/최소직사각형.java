class Solution {
    public int solution(int[][] sizes) {
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int x = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = x;
            }
        }
        
        int maxX = 0;
        int maxY = 0;
        for (int i = 0; i < sizes.length; i++) {
            maxX = Math.max(maxX, sizes[i][0]);
            maxY = Math.max(maxY, sizes[i][1]);
        }
        
        return maxX * maxY;
    }
}