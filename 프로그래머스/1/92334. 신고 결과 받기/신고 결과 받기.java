import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 중복 제거
        Set<String> rSet = new HashSet<>(Arrays.asList(report));
        int pCount = id_list.length;
        int[] result = new int[pCount];
        
        Map<String, Integer> reCountMap = new HashMap<>();
        
        for(int i = 0; i < pCount; i ++) {
            reCountMap.put(id_list[i], 0);
        }
        
        
        // for 문 돌려서 map에 넣기
        for(String rep : rSet) {
            String[] str = rep.split(" ");
            reCountMap.put(str[1], reCountMap.get(str[1]) + 1);
        }
        
        // 신고 횟수 배열 돌리기
        for(String rep : rSet) {
            String[] str = rep.split(" ");
            if(reCountMap.get(str[1]) >= k) {
                result[Arrays.asList(id_list).indexOf(str[0])] += 1;
            }
        }
        return result;
    }
}