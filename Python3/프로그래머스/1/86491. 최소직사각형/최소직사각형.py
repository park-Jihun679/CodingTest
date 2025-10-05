def solution(sizes):
    for i in range(len(sizes)):
        w, h = sizes[i]
        if w < h:
            sizes[i] = [h, w]
    
    mx = max(s[0] for s in sizes)
    my = max(s[1] for s in sizes)
    
    answer = mx * my
    return answer