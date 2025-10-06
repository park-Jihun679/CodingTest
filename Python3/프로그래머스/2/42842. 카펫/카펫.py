def solution(brown, yellow):
    sum_block = brown + yellow
    x = 0
    
    for i in range(3, sum_block):
        x = sum_block // i
        if sum_block % i == 0 and 2 * (x + i - 2) == brown:
            return [x, i]
    