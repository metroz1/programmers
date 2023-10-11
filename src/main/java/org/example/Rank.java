package org.example;

public class Rank {
    public int solution(int n, int[][] results) {

        int answer = 0;

        boolean[][] gameResult = new boolean[n + 1][n + 1];

        for (int[] result : results)
            gameResult[result[0]][result[1]] = true;

        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (gameResult[i][k] && gameResult[k][j])
                        gameResult[i][j] = true;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            boolean isRanked = true;
            for (int j = 1; j <= n; j++) {
                if (i == j)
                    continue;

                if (!gameResult[i][j] && !gameResult[j][i]) {
                    isRanked = false;
                    break;
                }
            }

            answer = isRanked ? answer + 1 : answer;
        }

        return answer;
    }

}
