package org.example;

// 프로그래머스 기사단원의 무기 문제

public class WeaponOfKnight {

    public int solution(int number, int limit, int power) {

        int answer = 0;

        for (int i = 1; i <= number; i++) {

            int divNum = 0;

            for (int j = 1; j * j <= i; j++) {

                if (i % j == 0) {
                    divNum += 2;

                }

            }
            System.out.println("divNum = " + divNum);
            if ( divNum > limit)
                answer += power;
            else
                answer += divNum;
        }

        return answer;
    }
}
