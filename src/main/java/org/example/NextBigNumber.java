package org.example;

public class NextBigNumber {

    public int solution(int n) {

        // 자연수 n이 주어졌을 때, n의 다음 큰 숫자는 다음과 같이 정의
        // n의 다음 큰 숫자는 n보다 큰 자연수
        // n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같음
        // n의 다음 큰 숫자는 위 조건을 만족하는 수 중에 가장 작은 수

        int countOneOfN =countOneOfBinary(n);

        for (int i = n + 1; i <= 1000000; i++) {

            if (countOneOfN == countOneOfBinary(i))
                return i;
        }

        return 1000000;
    }

    private int countOneOfBinary(int n) {

        int count;

        for (count = 0; n != 0; count++) {

            n &= (n - 1);
        }

        return count;
    }
}
