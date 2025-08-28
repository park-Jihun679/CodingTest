import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> nSet = new HashSet<>();
        
        for(int n : nums) {
            nSet.add(n);
        }
        
        int answer = nums.length / 2;
        if (nSet.size() < answer) {
            answer = nSet.size();
        }
        
        return answer;
    }
}