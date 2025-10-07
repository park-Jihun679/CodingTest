class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }
    
    private int dfs(int[] numbers, int target, int cur, int depth) {
        if(depth == numbers.length) {
            if (target == cur) {
                return 1;
            }
            return 0;
        }
        int plus = dfs(numbers, target, cur + numbers[depth], depth + 1);
        int minus = dfs(numbers, target, cur - numbers[depth], depth + 1);
        
        return plus + minus;
    }
}