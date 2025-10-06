from itertools import permutations

def solution(numbers):
    answer = 0
    set_nums = set()
    
    for i in range(1, len(numbers) + 1):
        for num in permutations(numbers, i):
            set_nums.add(int(''.join(num)))
    
    for s_num in set_nums:
        if isPrime(s_num):
            answer += 1

    return answer

def isPrime(num):
    if num < 2: return False
    for i in range(2, int(num ** 0.5) + 1):
        if num % i == 0:
            return False
    return True