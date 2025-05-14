class Solution {
    public int solution(int[] wallet, int[] bill) {
        // 큰 쪽을 반 접는다.
        // 홀수일 경우 접은 후 소수점은 버린다 (int는 소수점 미반환)
        int answer = 0;
        while (true) {
            if ((wallet[0] >= bill[0] && wallet[1] >= bill[1]) ||
                (wallet[0] >= bill[1] && wallet[1] >= bill[0])) {
                return answer;
            } else {
                if (bill[0] > bill[1]) {
                    bill[0] = bill[0] / 2;
                } else {
                    bill[1] = bill[1] / 2;
                }
            answer += 1;
            }
        }
    }

}