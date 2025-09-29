class Solution {
    public int solution(String word) {
        String vowel = "AEIOU";
        int[] numbers = {781, 156, 31, 6, 1};
        int answer = 0;
        
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = 0;
            for(int j = 0; j < 5; j++) {
                if(c == vowel.charAt(j)) {
                    index = j;
                    break;
                }
            }
            answer += index * numbers[i] + 1;
        }
        
        
        return answer;
    }
}