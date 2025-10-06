import java.util.*;

class Solution {
    static Set<Integer> nSet = new HashSet<>();
    static boolean[] visited;
    
    public int solution(String numbers) {
        int answer = 0;
        visited = new boolean[numbers.length()];
        dfs(numbers, "", 0);
        for (int n : nSet) {
            if(isPrime(n)) {
                answer ++;
            }
        }
        return answer;
    }
    
    private void dfs(String numbers, String cur, int count) {
        if (!cur.isEmpty()) {
            nSet.add(Integer.parseInt(cur));
        }
        for (int i = 0; i < numbers.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(numbers, cur + numbers.charAt(i), count + 1);
                visited[i] = false;
            }
        }
    }
    
    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}