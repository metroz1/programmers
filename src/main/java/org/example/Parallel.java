package org.example;

public class Parallel {

    public int solution(int[][] dots) {
        int answer = 0;

        for (int i = 0; i < dots.length - 2; i++) {
            for (int j = i + 1; j < dots.length - 1; j++) {
                int xAmount1 = dots[j][0] - dots[i][0];
                int yAmount1 = dots[j][1] - dots[i][1];

                for (int k = j + 1; k < dots.length; k++) {
                    int xAmount2 = dots[k][0] - dots[i][0];
                    int yAmount2 = dots[k][1] - dots[i][1];

                    // 계산한 두 직선의 기울기를 비교하여 평행 여부 확인
                    if (xAmount1 * yAmount2 == xAmount2 * yAmount1) {
                        return 1;
                    }
                }
            }
        }

        return answer;
    }
}
