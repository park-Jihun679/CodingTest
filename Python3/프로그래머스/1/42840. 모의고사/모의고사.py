def solution(answers):
    a = [1, 2, 3, 4, 5]
    b = [2, 1, 2, 3, 2, 4, 2, 5]
    c = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    a_ans = b_ans = c_ans = 0
    
    for i in range(len(answers)):
        if answers[i] == a[i % 5]:
            a_ans += 1
        if answers[i] == b[i % 8]:
            b_ans += 1
        if answers[i] == c[i % 10]:
            c_ans += 1
    
    answer = []
    max_score = max(a_ans, b_ans, c_ans)
    
    if max_score == a_ans:
        answer.append(1)
    if max_score == b_ans:
        answer.append(2)
    if max_score == c_ans:
        answer.append(3)
    return answer