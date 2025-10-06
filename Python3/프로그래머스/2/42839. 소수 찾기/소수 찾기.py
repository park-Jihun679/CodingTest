from itertools import permutations

def solution(numbers):
    s_nums = set()
    answer = 0
    
    for i in range(1, len(numbers) + 1):
        for n in permutations(numbers, i):
            s_nums.add(int(''.join(n)))
    
    for n in s_nums:
        if isPrime(n):
            answer += 1
            
    return answer

def isPrime(num):
    if num < 2: return False
    for i in range(2, int(num ** 0.5) + 1):
        if num % i == 0: return False
    return True