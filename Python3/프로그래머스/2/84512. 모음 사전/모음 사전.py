def solution(word):
    vowels = ['A', 'E', 'I', 'O', 'U']
    counts = [781, 156, 31, 6, 1]    
    answer = 0
    
    for i, value in enumerate(word):
        idx = vowels.index(value)
        answer += idx * counts[i] + 1
    return answer