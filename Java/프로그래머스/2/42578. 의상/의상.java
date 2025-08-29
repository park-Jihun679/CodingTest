import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> typeCount = new HashMap<>();
        
        // 각 의상 종류별 개수 세기
        for (String[] cloth : clothes) {
            String type = cloth[1];
            typeCount.put(type, typeCount.getOrDefault(type, 0) + 1);
        }
        
        // (각 종류별 개수 + 1)을 모두 곱하고 1을 빼기
        int answer = 1;
        for (int count : typeCount.values()) {
            answer *= (count + 1);
        }
        
        return answer - 1;  // 아무것도 안입는 경우 제외
    }
}