import math

def solution(numer1, denom1, numer2, denom2):
    # 두 분모의 최소공배수 구하기
    lcm_num = lcm(denom1, denom2)
    
    # 각 분수를 통분하여 분자 계산
    new_numer = numer1 * (lcm_num // denom1) + numer2 * (lcm_num // denom2)
    
    # 기약분수로 만들기 위해 최대공약수로 나누기
    gcd_num = math.gcd(new_numer, lcm_num)
    
    return [new_numer // gcd_num, lcm_num // gcd_num]


def lcm(a, b):
    return a * b // math.gcd(a, b)
