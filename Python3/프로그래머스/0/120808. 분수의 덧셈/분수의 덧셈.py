from fractions import Fraction

def solution(numer1, denom1, numer2, denom2):
    # Fraction(분자, 분모) 형태로 각각의 분수 생성
    frac1 = Fraction(numer1, denom1)
    frac2 = Fraction(numer2, denom2)
    
    # 두 분수 더하기 (자동으로 통분 + 약분 처리)
    result = frac1 + frac2

    # Fraction은 내부적으로 분자/분모를 약분된 상태로 저장
    return [result.numerator, result.denominator]
