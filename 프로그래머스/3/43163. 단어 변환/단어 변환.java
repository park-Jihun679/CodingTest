import java.util.*;

class Solution {
    class Word {
        String word;
        int count;
        
        public Word(String word, int count) {
            this.word = word;
            this.count = count;
        }
    }
    
    private int getDiffCount(String word1, String word2) {
        int count = 0;
        for(int i = 0; i < word1.length(); i ++) {
            if(word1.charAt(i) != word2.charAt(i)) {
                count ++;
            }
        }
        return count;
    }
    
    public int solution(String begin, String target, String[] words) {
        Set<String> visited = new HashSet<>();
        Queue<Word> queue = new LinkedList<>();
        queue.add(new Word(begin, 0));
        visited.add(begin);
        
        while(!queue.isEmpty()) {
            Word cur = queue.poll();
            
            if (cur.word.equals(target)) {
                return cur.count;
            }
            for (String w : words) {
                if(!visited.contains(w) && getDiffCount(cur.word, w) == 1) {
                    queue.add(new Word(w, cur.count + 1));
                    visited.add(w);
                }
            }
        }
        
        return 0;
    }
}