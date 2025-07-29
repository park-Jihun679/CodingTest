import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] ansCount = {0, 0, 0};
        
        for (int i = 0; i < answers.length; i++) {
            if (a[i % 5] == answers[i]) {
                ansCount[0]++;
            }
            if (b[i % 8] == answers[i]) {
                ansCount[1]++;
            }
            if (c[i % 10] == answers[i]) {
                ansCount[2]++;
            }
        }
        int maxScore = Math.max(ansCount[0], Math.max(ansCount[1], ansCount[2]));
        
        for (int i = 0; i < 3; i ++) {
            if (maxScore == ansCount[i]) {
                answer.add(i + 1);
            }
        }

        int[] result = answer.stream()
                     .mapToInt(Integer::intValue)
                     .toArray();
    return result;
    }
}