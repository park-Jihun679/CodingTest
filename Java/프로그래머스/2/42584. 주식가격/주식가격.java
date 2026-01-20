class Solution {
    public int[] solution(int[] prices) {
        int size = prices.length;
        int[] answer = new int[size];
        
        for (int i = 0; i < size - 1; i++) {
            answer[i] = size - 1 - i;
            for (int j = i + 1; j < size; j++) {
                if (prices[i] > prices[j]) {
                    answer[i] = j - i;
                    break;
                }
            }
        }
        
        return answer;
    }
}