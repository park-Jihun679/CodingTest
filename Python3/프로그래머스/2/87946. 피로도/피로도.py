from itertools import permutations

def solution(k, dungeons):
    answer = 0
    
    for order in permutations(dungeons, len(dungeons)):
        now_cost = k
        count = 0
        
        for need, cost in order:
            if now_cost >= need:
                now_cost -= cost
                count += 1
            else: break
    
        answer = max(count, answer)
    
    return answer