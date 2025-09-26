class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sumBlock = brown + yellow;
        
        for(int x = 3; x < sumBlock - 2; x++) {
            int y = sumBlock / x;
            if (brown == 2 * ((y - 2) + x)) {
                if (((x - 2) * (y - 2)) == yellow) {
                    answer[0] = x;
                    answer[1] = y;
                }
            }
        
        }
        
        return answer;
    }
}