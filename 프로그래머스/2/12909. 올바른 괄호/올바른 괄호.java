class Solution {
    boolean solution(String s) {
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
            } else {
                count--;
            }

            // 중간에 닫는 괄호가 더 많으면 바로 false
            if (count < 0) {
                return false;
            }
        }

        // 끝났을 때 개수가 맞아야 올바른 괄호
        return count == 0;
    }
}