from itertools import permutations

def solution(k, dungeons):
    max_count = 0
    
    for order in permutations(dungeons, len(dungeons)):
        now_cost = k
        count = 0
        for need, cost in order:
            if now_cost >= need:
                count += 1
                now_cost -= cost
            else: break
        max_count = max(max_count, count)
    
    return max_count